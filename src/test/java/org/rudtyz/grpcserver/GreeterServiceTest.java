package org.rudtyz.grpcserver;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.health.v1.HealthCheckRequest;
import io.grpc.health.v1.HealthCheckResponse;
import io.grpc.health.v1.HealthGrpc;
import org.junit.jupiter.api.Test;
import org.rudtyz.grpcserver.dto.GreeterGrpc;
import org.rudtyz.grpcserver.dto.HelloRequest;
import org.rudtyz.grpcserver.dto.SampleReply;
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

    private ManagedChannel newManagedChannel() {
        return ManagedChannelBuilder.forAddress("localhost", grpcPort)
                .usePlaintext()
                .build();
    }

    @Test
    public void helloRequest() throws ExecutionException, InterruptedException {
        final ManagedChannel channel = newManagedChannel();

        final GreeterGrpc.GreeterFutureStub greeterFutureStub = GreeterGrpc.newFutureStub(channel);
        final HelloRequest helloRequest = HelloRequest.newBuilder()
                .setName("grpc")
                .build();
        final String reply = greeterFutureStub.sayHello(helloRequest).get().getMessage();

        assertThat(reply).isEqualTo("hello grpc");
    }

    @Test
    public void sampleRequest() throws ExecutionException, InterruptedException {
        final ManagedChannel channel = newManagedChannel();

        final GreeterGrpc.GreeterFutureStub greeterFutureStub = GreeterGrpc.newFutureStub(channel);

        final SampleReply reply = greeterFutureStub.getSample(com.google.protobuf.Empty.newBuilder().build()).get();
        System.out.println(reply.getName());
        System.out.println(reply.getNumber());
//        assertThat(reply).isEqualTo("helloasync");
    }

    @Test
    public void healthCheck()  throws ExecutionException, InterruptedException {
        final ManagedChannel channel = newManagedChannel();

        final HealthGrpc.HealthFutureStub healthFutureStub = HealthGrpc.newFutureStub(channel);
        final HealthCheckRequest healthCheckRequest = HealthCheckRequest.newBuilder()
                .setService(GreeterGrpc.getServiceDescriptor().getName())
                .build();

        final HealthCheckResponse.ServingStatus status = healthFutureStub.check(healthCheckRequest)
                .get()
                .getStatus();

        assertThat(status).isEqualTo(HealthCheckResponse.ServingStatus.SERVING);
    }
}
