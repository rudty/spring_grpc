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
     *  비동기 서비스(@Async)에서 값을 가져와서 응답
     */
    @Override
    public void getSample(Empty request, StreamObserver<SampleReply> responseObserver) {
        var f = myService.getSample();
        System.out.println("tid1:" + Thread.currentThread().getId());
        f.thenAccept(sample -> {
            System.out.println("tid3:" + Thread.currentThread().getId());
                responseObserver.onNext(
                        SampleReply
                                .newBuilder()
                                .setName(sample.getName())
                                .setNumber(sample.getNumber())
                                .build()
                );

                responseObserver.onCompleted();
        });
    }
}
