package com.example.springretrytest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @program: spring-retry-test
 * @description:
 * @author: Simon Zhuang
 * @create: 2019-01-03 11:31
 **/
@Table
@Entity
@Data
public class SysUser {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;

  @Column
  private Integer age;

  @Column
  private String sex;

  public SysUser(String name, Integer age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }
}
