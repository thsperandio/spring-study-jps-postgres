package com.spring.study.repository;

import com.spring.study.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer> {

    List<Users> findByNameContaining(String name);

//    Users findByUsername(String username);
//
//    @Query("SELECT u FROM Users u WHERE u.name LIKE %:name%")
//    List<Users> filtrarPorNome(@Param("name") String name);
}
