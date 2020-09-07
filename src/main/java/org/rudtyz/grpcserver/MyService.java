package org.rudtyz.grpcserver;

import org.rudtyz.grpcserver.entity.Sample;
import org.rudtyz.grpcserver.entity.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.concurrent.CompletableFuture;

@Service
public class MyService {

    @Autowired
    SampleRepository sampleRepository;
    private void printTid() {
        System.out.println(getClass().getName() +  " tid:" + Thread.currentThread().getId());
    }

    public String getHello() {
        printTid();
        return "hello";
    }

    @Async
    public CompletableFuture<String> throwAsync() {
        printTid();
        throw new RuntimeException("throw async");
    }

    public Sample getSample() {
        printTid();
        sampleRepository.saveAndFlush(new Sample("1", 2));
        var s = sampleRepository.findById("1").get();
        return s;
    }
}
