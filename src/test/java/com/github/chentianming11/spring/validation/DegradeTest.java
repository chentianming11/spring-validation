package com.github.chentianming11.spring.validation;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 陈添明
 */
public class DegradeTest {


    @Test
    public void test1() throws IOException, InterruptedException {
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .build();

        Request request = new Request.Builder()
                .url("http://api-dora.shoff.ke.com/keApi/test/http")
                .build();

        ExecutorService executorService = Executors.newFixedThreadPool(100);

        executorService.execute(() -> {
            for (int i = 0; i < 50; i++) {
                Response response = null;
                try {
                    response = httpClient.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String string = null;
                try {
                    string = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string);
            }
        });

        executorService.execute(() -> {
            for (int i = 0; i < 50; i++) {
                Response response = null;
                try {
                    response = httpClient.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String string = null;
                try {
                    string = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string);
            }
        });

        executorService.execute(() -> {
            for (int i = 0; i < 50; i++) {
                Response response = null;
                try {
                    response = httpClient.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String string = null;
                try {
                    string = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string);
            }
        });

        executorService.execute(() -> {
            for (int i = 0; i < 50; i++) {
                Response response = null;
                try {
                    response = httpClient.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String string = null;
                try {
                    string = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string);
            }
        });


        executorService.execute(() -> {
            for (int i = 0; i < 50; i++) {
                Response response = null;
                try {
                    response = httpClient.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String string = null;
                try {
                    string = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string);
            }
        });


        executorService.execute(() -> {
            for (int i = 0; i < 50; i++) {
                Response response = null;
                try {
                    response = httpClient.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String string = null;
                try {
                    string = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string);
            }
        });

        executorService.execute(() -> {
            for (int i = 0; i < 50; i++) {
                Response response = null;
                try {
                    response = httpClient.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String string = null;
                try {
                    string = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string);
            }
        });

        executorService.execute(() -> {
            for (int i = 0; i < 50; i++) {
                Response response = null;
                try {
                    response = httpClient.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String string = null;
                try {
                    string = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string);
            }
        });


        executorService.execute(() -> {
            for (int i = 0; i < 50; i++) {
                Response response = null;
                try {
                    response = httpClient.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String string = null;
                try {
                    string = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string);
            }
        });


        executorService.execute(() -> {
            for (int i = 0; i < 50; i++) {
                Response response = null;
                try {
                    response = httpClient.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String string = null;
                try {
                    string = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string);
            }
        });

        executorService.execute(() -> {
            for (int i = 0; i < 50; i++) {
                Response response = null;
                try {
                    response = httpClient.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String string = null;
                try {
                    string = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string);
            }
        });




        Thread.currentThread().join();


    }
}
