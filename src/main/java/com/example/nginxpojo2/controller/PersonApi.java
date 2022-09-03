package com.example.nginxpojo2.controller;

import com.example.nginxpojo2.pojo.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fenglingzmb
 * @date 2022/9/3
 */
@RestController
public class PersonApi {
    @GetMapping("/human/person")
    public Person getPerson(){
        Person person = new Person();
        person.setName("fenglingzmb");
        person.setAge(24);
        List<String> hobbies = new ArrayList<>();
        hobbies.add("read");
        hobbies.add("game");
        hobbies.add("sleep");
        person.setHobbies(hobbies);
        return person;
    }
}
