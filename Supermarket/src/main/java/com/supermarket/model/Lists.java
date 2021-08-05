package com.supermarket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "lists")
public class Lists {

private static final long serialVersionUID = -2343243243242432341L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="item_name")
	private String item_name;
	
	
	@Column(name="item_price")
	private String item_price;

	
	@Column(name="item_numbers")
	private long item_numbers;
	
	
	@Column(name="active_status")
	private boolean active_status;
	
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public String getItem_price() {
		return item_price;
	}


	public void setItem_price(String item_price) {
		this.item_price = item_price;
	}


	public long getItem_numbers() {
		return item_numbers;
	}


	public void setItem_numbers(long item_numbers) {
		this.item_numbers = item_numbers;
	}


	public boolean isActive_status() {
		return active_status;
	}


	public void setActive_status(boolean active_status) {
		this.active_status = active_status;
	}
	

	
}
