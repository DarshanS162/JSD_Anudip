package com.techfire.gg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  // it will auto increment ID
	private int uId;
	
	@Column(length=15,nullable=false)
	private String fName;
	
	@Column(length=15)
	private String lName;
	
	@Column(length = 12, nullable = false, unique = true)
	@NotNull(message = "user number is mandatory")
	private long uPhone;
	
	@Column(length=25,nullable=false,unique=true)
	@NotBlank(message = "user email is mandatory to fill")
	private String email;
	
	@Column(length=40)
	private String addr;
	
	@OneToOne(mappedBy = "user" )
	    private Cart cart;

	
}
