package com.github.chentianming11.spring.validation.http;

import com.github.chentianming11.spring.validation.base.Result;
import com.github.chentianming11.spring.validation.pojo.dto.UserDTO;
import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author 陈添明
 */
@RetrofitClient(baseUrl = "http://localhost:8080/api/user")
public interface HttpTestAPI {

    @GET("getByAccount")
    Result<UserDTO> getByAccount(@Query("account") String account);

    @GET("getByAccount/notExist")
    Result<UserDTO> throw404Exception(@Query("account") String account);

}
