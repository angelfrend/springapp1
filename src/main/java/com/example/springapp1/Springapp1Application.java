package com.example.springapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springapp1Application {

    public static void main(String[] args) {
        System.out.println("Start of application");
        ApplicationContext ctx = SpringApplication.run(Springapp1Application.class, args);
        var temp = ctx.getEnvironment().getProperty("app.message");
        System.out.println(temp);
    }

}
