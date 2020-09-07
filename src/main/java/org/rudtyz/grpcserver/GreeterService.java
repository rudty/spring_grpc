package org.rudtyz.grpcserver;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.rudtyz.grpcserver.dto.GreeterGrpc;
import org.rudtyz.grpcserver.dto.HelloReply;
import org.rudtyz.grpcserver.dto.HelloRequest;
import org.rudtyz.grpcserver.dto.SampleReply;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class GreeterService extends GreeterGrpc.GreeterImplBase {

    @Autowired
    MyService myService;

    /**
     *  grpc 기본 HelloRequest.
     *  하나의 응답을 반환하는 객체이지만 StreamObserver<> 로 전달하며
     *  정상적인 응답일 떄는 반드시 1번의 responseObserver.onNext 와 responseObserver.onCompleted 호출이 필요
     *  responseObserver.onNext 는 여러번 호출 시 에러 responseObserver.onCompleted 는 현재
     *  여러번 호출 해도 상관없는듯
     */
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        var f = myService.getHello();
        var name = request.getName();
        responseObserver.onNext(
                HelloReply
                        .newBuilder()
                        .setMessage(f + " " + name)
                        .build());
        responseObserver.onCompleted();
    }

    /**
     * jpa 연동
     */
    @Override
    public void getSample(Empty request, StreamObserver<SampleReply> responseObserver) {
        var sample = myService.getSample();
        responseObserver.onNext(
                SampleReply
                        .newBuilder()
                        .setName(sample.getName())
                        .setNumber(sample.getNumber())
                        .build()
        );
        responseObserver.onCompleted();
    }

    /**
     * 비동기에서 throw 할때는 spring controller 와 비슷하게 onError 로 넘기면 될 듯
     */
    @Override
    public void asyncThrowException(Empty request, StreamObserver<HelloReply> responseObserver) {
        var f = myService.throwAsync();
        f.handle((s, ex) -> {
            if (ex != null) {
                responseObserver.onError(ex);
            } else {
                var res = HelloReply
                        .newBuilder()
                        .setMessage(s)
                        .build();
                responseObserver.onNext(res);
            }
            responseObserver.onCompleted();
            return null;
        });
    }
}
