package com.techfire.gg.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.techfire.gg.entity.Cart;


public interface CartRepository extends JpaRepository<Cart, Long> {


}
