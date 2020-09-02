package org.rudtyz.grpcserver;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

    @Async
    public CompletableFuture<String> doAsync() {
        System.out.println("tid2:" + Thread.currentThread().getId());
        return CompletableFuture.completedFuture("async");
    }
}
