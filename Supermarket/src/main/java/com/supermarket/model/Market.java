package com.supermarket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "market")
public class Market {

	
private static final long serialVersionUID = -2343243243242432341L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="arabic_name")
	private String arabic_name;
	
	
	@Column(name="english_name")
	private String english_name;
	
	@Column(name="image")
	private byte[] image;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getArabic_name() {
		return arabic_name;
	}

	public void setArabic_name(String arabic_name) {
		this.arabic_name = arabic_name;
	}

	public String getEnglish_name() {
		return english_name;
	}

	public void setEnglish_name(String english_name) {
		this.english_name = english_name;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
	
	
	
	
	
}
