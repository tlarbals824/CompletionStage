package com.sim.completionstage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class CompletionStageApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompletionStageApplication.class, args);
//        log.info("start thenAccept");
//        CompletionStageThenAcceptExample.thenAccept();
//        CompletionStageThenAcceptRunningExample.thenAccept();
//        log.info("start thenAcceptAsync");
//        CompletionStageThenAcceptExample.thenAcceptAsync();
//        CompletionStageThenAcceptRunningExample.thenAcceptAsync();
//        CompletionStageThenAcceptAsyncExecutorExample.thenAsync();
//        CompletionStageThenApplyExample.thenApply();
//        CompletionStageThenComposeExample.thenCompose();
//        CompletionStageThenRunExample.thenRun();
        CompletionStageExceptionallyExample.exceptionally();
    }

}
