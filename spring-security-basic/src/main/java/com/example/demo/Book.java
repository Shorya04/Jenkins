package com.example.demo;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



import lombok.Data;

@Entity
@Data
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Author
	@NotEmpty(message = "Enter Author name")
	private String author;
	@NotEmpty(message = "Enter Book name")
	private String name;
	@NotNull(message="Enter price of book.")
	private BigDecimal price;
	
	
	public Book(@NotEmpty(message = "Enter Book name") String name,
	 @NotNull(message = "Enter price of book.") BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}


	public Book(@NotEmpty(message = "Enter Author name") String author,
			@NotEmpty(message = "Enter Book name") String name,
			@NotNull(message = "Enter price of book.") BigDecimal price) {
		super();
		this.author = author;
		this.name = name;
		this.price = price;
	}


	
}

