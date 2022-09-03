package com.example.nginxpojo2.rest;

import com.example.nginxpojo2.pojo.Dog;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.Setter;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author fenglingzmb
 * @date 2022/9/3
 */
@Getter
@Setter
@Service
public class DogService {
    DogClient dogClient;

    OkHttpClient okHttpClient;

    String serviceUrl;

    public Dog getDog() throws IOException {
        serviceUrl = "http://192.168.0.101:7777";
        okHttpClient = new OkHttpClient.Builder().readTimeout(30L, TimeUnit.SECONDS)
                .connectTimeout(3L,TimeUnit.SECONDS).build();

        Gson gson = new GsonBuilder().create();
        List<Converter.Factory> converters = Collections.singletonList(GsonConverterFactory.create(gson));

        Retrofit.Builder retrofit = new Retrofit.Builder().baseUrl(serviceUrl).client(okHttpClient);
        converters.forEach(retrofit::addConverterFactory);

        DogClient dogClient = retrofit.build().create(DogClient.class);

        Call<Dog> call = dogClient.getDog();

        Response<Dog> response = call.execute();
        return response.body();
    }
}
