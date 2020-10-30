package com.github.chentianming11.spring.validation.http;

import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import com.github.lianjiatech.retrofit.spring.boot.degrade.Degrade;
import retrofit2.http.GET;

/**
 * @author 陈添明
 */
@RetrofitClient(baseUrl = "http://localhost:8080/api/degrade")
@Degrade(count = 300, timeWindow = 3)
public interface HttpDegradeApi {


    @GET("test")
    @Degrade(count = 300, timeWindow = 3)
    Object test();

    @GET("test2")
    @Degrade(count = 500, timeWindow = 3)
    Object test2();

    @GET("test3")
    Object test3();
}
