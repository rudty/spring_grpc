package org.rudtyz.grpcserver;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

@GRpcService
public class GreeterService extends GreeterGrpc.GreeterImplBase {


    @Async
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        var name = request.getName();
            responseObserver.onNext(
                    HelloReply
                            .newBuilder()
                            .setMessage(name + 0)
                            .build());
        responseObserver.onCompleted();
    }
}
