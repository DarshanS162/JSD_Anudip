package com.techfire.gg.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfire.gg.entity.Cart;
import com.techfire.gg.entity.CartItems;
import com.techfire.gg.entity.Product;
import com.techfire.gg.entity.User;
import com.techfire.gg.exception.ProductIdNotFoundException;
import com.techfire.gg.exception.UserIdNotFoundException;
import com.techfire.gg.repository.CartItemsRepository;
import com.techfire.gg.repository.CartRepository;
import com.techfire.gg.repository.ProductRepository;
import com.techfire.gg.repository.UserRepository;
import com.techfire.gg.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	CartItemsRepository cartItemsRepo;
	
	@Autowired
    UserRepository userRepo;
	
	@Autowired
	CartRepository cartRepo;
	
	//lists all the products from database
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}
	
	//list product by ID
	 public Product getProductById(int pId) {
	        return productRepo.findById(pId).orElseThrow(()-> new ProductIdNotFoundException("Please enter valid Product id"));
	    }
	 
	 //list products as per category
	 public List<Product> getProductsByCategoryId(int categoryId) {
	        return productRepo.findByCategoryId(categoryId);
	    }
	 	
	// add to product cart
	 public List<Integer> addToCart(int uId, int pId){
		 List<Integer> mylist=new ArrayList<>();
		 mylist.add(uId);
		 mylist.add(pId);
		return mylist;
	
		}

	 	
		
	}
	 

	
		


	
	


