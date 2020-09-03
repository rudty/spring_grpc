package org.rudtyz.grpcserver;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class GreeterServiceTest {

    @Value("${grpc.port}")
    int grpcPort = 1234;

    @Test
    public void helloRequest() throws ExecutionException, InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", grpcPort)
                .usePlaintext()
                .build();

        final GreeterGrpc.GreeterFutureStub greeterFutureStub = GreeterGrpc.newFutureStub(channel);
        final HelloRequest helloRequest = HelloRequest.newBuilder()
                .setName("hello")
                .build();
        final String reply = greeterFutureStub.sayHello(helloRequest).get().getMessage();

        assertThat(reply).isEqualTo("helloasync");
    }


}
