package com.techfire.gg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int quantity;
    
    @ManyToOne
    @JoinColumn(name = "uId",referencedColumnName ="uId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "pId",referencedColumnName ="pId" )
    private Product product;

    
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

}
