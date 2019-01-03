package com.example.springretrytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class SpringRetryTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringRetryTestApplication.class, args);
  }

}

