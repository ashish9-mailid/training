package com.training.bean;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Book implements Serializable{ 

	private String isbn;
	private String title;
	private double price;
	private long stock;
	private int port;
	private int qty;
	private double amount;
	
	
}
