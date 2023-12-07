package com.ninos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ninos.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {



    Boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);

    @Query("select u.active from User u where u.email=?1")
    int getActiveByEmail(String email);

    @Query("select u.password from User u where u.email=:email")
    String getPasswordByEmail(@Param("email") String email);


//    Optional<User> findByUsername(String username);

//    Boolean existsByUsername(String username);

//    Optional<User> findByEmail(String email);











}
