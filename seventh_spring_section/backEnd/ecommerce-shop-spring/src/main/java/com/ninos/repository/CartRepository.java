package com.ninos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ninos.model.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

//      Cart findByUserId(Long userId);

        @Query("SELECT c FROM Cart c WHERE c.user.id=:userId")
        Cart findByUserId(@Param("userId") Long userId);
}
