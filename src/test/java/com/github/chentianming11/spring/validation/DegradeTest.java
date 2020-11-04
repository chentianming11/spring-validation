package com.github.chentianming11.spring.validation;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;

/**
 * @author 陈添明
 */
public class DegradeTest {


    @Test
    public void test1() throws IOException {
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .build();

        Request request = new Request.Builder()
                .url("http://dora.dev.lianjia.com:8080/api/degrade/test/execute")
                .build();

        for (int i = 0; i < 100; i++) {
            Response response = httpClient.newCall(request).execute();
            String string = response.body().string();
            System.out.println(string);
        }

    }
}
