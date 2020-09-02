package org.rudtyz.grpcserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class GrpcserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcserverApplication.class, args);
	}

}
