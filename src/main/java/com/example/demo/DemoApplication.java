package com.example.demo;

import com.example.demo.Domain.Role;
import com.example.demo.Domain.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repo) throws Exception {
        if (repo.count() == 0) repo.save(new User("user","user", Arrays.asList(new Role("USER"), new Role("ACTUATOR"))));
        builder.userDetailsService(s -> new CustomUserDetails(repo.findByUsername(s)));
    }
}
