package com.supermarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.supermarket.model.Lists;
import com.supermarket.services.ListsService;

@RestController
public class ListsController {

	
	@Autowired
	ListsService listsService;
	
	
	
	@GetMapping(path= "/view_lists")
	public ResponseEntity<Object> createList(){
	
	     List<Lists> lists = listsService.getLists();
	    
	     return new ResponseEntity<>(lists, HttpStatus.CREATED);
	}
	
	
}
