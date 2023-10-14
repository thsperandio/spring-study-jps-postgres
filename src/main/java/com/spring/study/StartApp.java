package com.spring.study;

import com.spring.study.repository.UserRepository;
import com.spring.study.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {

        List<Users> users = repository.findByNameContaining("Thiago");
        for(Users u: users){
            System.out.println(u);
        }

        Users user = new Users();
        user.setName("Thiago");
        user.setUsername("spring");
        user.setPassword("123");

        repository.save(user);

        for (Users u: repository.findAll()){
            System.out.println(u);
        }


    }
}
