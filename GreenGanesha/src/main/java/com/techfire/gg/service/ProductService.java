package com.techfire.gg.service;

import java.util.List;

import com.techfire.gg.entity.CartItems;
import com.techfire.gg.entity.Product;

public interface ProductService {
	
	//********* Retrieve product information********
	
	//lists all the products
	 public List<Product> getAllProducts();
	 
	 //getting product buy its id
	 public Product getProductById(int pId);
	 
	 // Retrieve a list of products belonging to a specific category
	 public List<Product> getProductsByCategoryId(int categoryId);
	 
	 
	
	//***************Manage user's interaction with products**********
	 
	 // Add a product to the user's shopping cart.
	 public List<Integer> addToCart(int uId, int pId);
	
	 
	 //get the list of products in a user's cart
	 
	 
	 
}
