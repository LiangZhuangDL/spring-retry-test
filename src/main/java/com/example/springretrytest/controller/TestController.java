package com.example.springretrytest.controller;

import com.example.springretrytest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-retry-test
 * @description:
 * @author: Simon Zhuang
 * @create: 2019-01-03 11:29
 **/
@RestController
public class TestController {

  @Autowired
  private TestService service;

  @PostMapping(value = "/create")
  public void create() throws Exception {
    service.create();
  }
}
