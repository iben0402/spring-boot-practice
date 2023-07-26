package com.iwona.secondProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// CUSTOM SCANNING FOR PACKAGES
//@SpringBootApplication(
//        scanBasePackages = {"com.iwona.secondProject",
//                "com.iwona.util"}
//)
@SpringBootApplication
public class SecondProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondProjectApplication.class, args);
    }

}
