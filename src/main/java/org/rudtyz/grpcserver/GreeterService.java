package org.rudtyz.grpcserver;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.function.Consumer;
import java.util.function.Supplier;

@GRpcService
public class GreeterService extends GreeterGrpc.GreeterImplBase {

    @Autowired
    AsyncService asyncService;

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        var f = asyncService.doAsync();
        System.out.println("tid1:" + Thread.currentThread().getId());
        f.thenAccept(n -> {
            System.out.println("tid3:" + Thread.currentThread().getId());
            var name = request.getName();
            responseObserver.onNext(
                    HelloReply
                            .newBuilder()
                            .setMessage(name + n)
                            .build());
            responseObserver.onCompleted();
        });
    }
}
