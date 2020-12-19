package com.cpg.springbootdemo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpg.springbootdemo.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
