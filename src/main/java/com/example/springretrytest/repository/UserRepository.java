package com.example.springretrytest.repository;

import com.example.springretrytest.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SysUser, Long> {

}
