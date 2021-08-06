package com.supermarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	
	
	
	@PutMapping(path= "/update_list", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> updateList(@RequestBody Lists list){
	
		if(listsService.updateLists(list)) {
			 return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
		}
		else {
			 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	
	
	
	@PutMapping(path= "/delete_list/{id}")
	public ResponseEntity<Object> deleteList(@PathVariable("id") long listID){
	
		if(listsService.deleteList(listID)) {
			 return new ResponseEntity<>("deleted", HttpStatus.ACCEPTED);
		}
		else {
			 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	
	
	
	@PutMapping(path= "/update_activation/{id}/{activeStatus}")
	public ResponseEntity<Object> changeListActivation(@PathVariable("id") long listID, @PathVariable("activeStatus") int activeStatus){
	
		if(listsService.updateListActivation(listID,activeStatus)) {
			 return new ResponseEntity<>("Activation is set", HttpStatus.ACCEPTED);
		}
		else {
			 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	
	
	
	
}
