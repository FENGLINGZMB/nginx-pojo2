package com.example.nginxpojo2.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author fenglingzmb
 * @date 2022/9/3
 */
@Getter
@Setter
public class Person {
    private String name;
    private Integer age;
    private List<String> hobbies;
}
