package com.techfire.gg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techfire.gg.entity.CartItems;
import com.techfire.gg.entity.Product;
import com.techfire.gg.exception.ProductIdNotFoundException;
import com.techfire.gg.exception.UserIdNotFoundException;
import com.techfire.gg.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService ps;
	
	@GetMapping("/allProducts")
	public List<Product>getAllProducts(){
		return ps.getAllProducts();
	}
	
	@GetMapping("/productById/{pId}")
	public Product getProductById(@PathVariable int pId) {
		return ps.getProductById(pId);
	}
	
	// finds products by category
	@GetMapping("/productsbycategory/{cId}")
	public List<Product> getProductsByCategory(@PathVariable int cId){
		return ps.getProductsByCategoryId(cId);
	}
	
	// add product to cart
//	 @PostMapping("/addToCart")
//	 public ResponseEntity<String> addToCart(@RequestParam int uId, @RequestParam int pId) {
//	      try {
//	         ps.addToCart(pId, uId);
//	         return new ResponseEntity<>("Product added to cart successfully", HttpStatus.OK);
//	        }catch (UserIdNotFoundException | ProductIdNotFoundException e) {
//	            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
//	        }
//	  }
	
}

 	 	