package org.rudtyz.grpcserver;

import org.rudtyz.grpcserver.entity.Sample;
import org.rudtyz.grpcserver.entity.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class MyService {

    @Autowired
    SampleRepository sampleRepository;

    public String getHello() {
        return "hello";
    }

    @Async
    public CompletableFuture<String> doAsync() {
        System.out.println("tid2:" + Thread.currentThread().getId());
        return CompletableFuture.completedFuture("async");
    }

    @Async
    public CompletableFuture<Sample> getSample() {
        sampleRepository.saveAndFlush(new Sample("1", 2));
        var s = sampleRepository.findById("1").get();

        System.out.println("tid2:" + Thread.currentThread().getId());
        return CompletableFuture.completedFuture(s);
    }
}
