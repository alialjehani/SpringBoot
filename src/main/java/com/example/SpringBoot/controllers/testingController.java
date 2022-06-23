package com.example.SpringBoot.controllers;

import com.example.SpringBoot.controllers.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.*;

@Controller
public class testingController {

    static Collection<Person> testLoginPage = new ArrayList<>();
    static {
        testLoginPage.add(new Person("Ali",22));
        //testLoginPage.add("Ali");
    }
//    @GetMapping("/login") // a controller can only return one method, if you want to return multiple info =, you can create a view that has all necessary info and return the view instead
//    @ResponseBody
//    public Collection<Person> test(){
//        return testLoginPage;
 //   }


    @RequestMapping("/welcomePage")
    public String helloUser(){
        //System.out.println("Hi" + name);
        return "login";
    }
    }



