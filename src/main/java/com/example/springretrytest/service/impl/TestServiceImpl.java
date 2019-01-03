package com.example.springretrytest.service.impl;

import com.example.springretrytest.entity.SysUser;
import com.example.springretrytest.repository.UserRepository;
import com.example.springretrytest.service.TestService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: spring-retry-test
 * @description:
 * @author: Simon Zhuang
 * @create: 2019-01-03 11:40
 **/
@Service
public class TestServiceImpl implements TestService {

  @Autowired
  private UserRepository userRepository;

  private Integer tag = 1;

  @Override
  @Transactional(rollbackFor = Exception.class)
  @Retryable(maxAttempts = 3, backoff = @Backoff(delay = 5000L, multiplier = 1))
  public void create() throws Exception {
    if (tag > 1) {
      System.out.println("************************重试第：" + (tag - 1) + "次************************");
      System.out.println("************************当前时间：" + new Date() + "************************");
    }
    if(tag <= 2){
      userRepository.save(new SysUser("Tom" + tag++, 20, "男"));
      throw new Exception();
    }else {
      userRepository.save(new SysUser("Tom" + tag++, 20, "男"));
    }
  }
}
