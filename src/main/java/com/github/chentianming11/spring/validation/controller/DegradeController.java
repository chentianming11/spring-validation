package com.github.chentianming11.spring.validation.controller;

import com.github.chentianming11.spring.validation.base.Result;
import com.github.chentianming11.spring.validation.http.HttpDegradeApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author 陈添明
 */
@RequestMapping("/api/degrade")
@RestController
public class DegradeController {

    @Autowired
    HttpDegradeApi httpDegradeApi;


    @GetMapping("/test")
    public Result test() throws InterruptedException {
        Random random = new Random(System.currentTimeMillis());
        int i = random.nextInt(1_000);
        Thread.sleep(i);
        return Result.ok();
    }


    @GetMapping("/test2")
    public Result test2() throws InterruptedException {
        Random random = new Random(System.currentTimeMillis());
        int i = random.nextInt(2_000);
        Thread.sleep(i);
        return Result.ok();
    }

    @GetMapping("/test3")
    public Result test3() throws InterruptedException {
        Random random = new Random(System.currentTimeMillis());
        int i = random.nextInt(3_000);
        Thread.sleep(i);
        return Result.ok();
    }


    @GetMapping("/test/execute")
    public Result testExecute() throws InterruptedException {
        httpDegradeApi.test();
        return Result.ok();
    }

    @GetMapping("/test2/execute")
    public Result test2Execute() throws InterruptedException {
        httpDegradeApi.test2();
        return Result.ok();
    }

    @GetMapping("/test3/execute")
    public Result test3Execute() throws InterruptedException {
        httpDegradeApi.test3();
        return Result.ok();
    }



}
