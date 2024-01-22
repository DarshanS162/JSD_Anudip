package com.techfire.gg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techfire.gg.entity.CartItems;

public interface CartItemsRepository extends JpaRepository<CartItems, Long>{
	
	//finds the cartitems by userId and productId
	@Query("SELECT ci FROM CartItems ci WHERE ci.user.uId = :uId AND ci.product.pId = :pId")
	Optional<CartItems> findByUserIdAndProductId(@Param("uId") int uId, @Param("pId") int pId);


	
	

}
