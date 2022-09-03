package com.example.nginxpojo2.rest;

import com.example.nginxpojo2.pojo.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author fenglingzmb
 * @date 2022/9/3
 */
@RestController
public class DogApi {
    @Autowired
    DogService dogService;

    @GetMapping("/animal/dog")
    public Dog getDog() throws IOException {
        return dogService.getDog();
    }
}
