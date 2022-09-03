package com.example.nginxpojo2.rest;

import com.example.nginxpojo2.pojo.Dog;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author fenglingzmb
 * @date 2022/9/3
 */
public interface DogClient {
    @GET("/animal/dog")
    Call<Dog> getDog();
}
