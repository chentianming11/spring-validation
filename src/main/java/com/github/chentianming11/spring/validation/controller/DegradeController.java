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
        return Result.ok(i);
    }


    @GetMapping("/test2")
    public Result test2() throws InterruptedException {
        Random random = new Random(System.currentTimeMillis());
        int i = random.nextInt(2_000);
        Thread.sleep(i);
        return Result.ok(i);
    }

    @GetMapping("/test3")
    public Result test3() throws InterruptedException {
        Random random = new Random(System.currentTimeMillis());
        int i = random.nextInt(3_000);
        Thread.sleep(i);
        return Result.ok(i);
    }


    @GetMapping("/test/execute")
    public Result testExecute() throws InterruptedException {
        Result<Integer> test = httpDegradeApi.test();
        return Result.ok(test);
    }

    @GetMapping("/test2/execute")
    public Result test2Execute() throws InterruptedException {
        Result<Integer> integerResult = httpDegradeApi.test2();
        return Result.ok(integerResult);
    }

    @GetMapping("/test3/execute")
    public Result test3Execute() throws InterruptedException {
        Result<Integer> integerResult = httpDegradeApi.test3();
        return Result.ok(integerResult);
    }



}
