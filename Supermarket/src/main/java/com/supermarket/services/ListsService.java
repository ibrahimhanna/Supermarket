package com.supermarket.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.model.Lists;
import com.supermarket.repository.ListsRepository;

@Service
public class ListsService {

	
	@Autowired
	ListsRepository listsRepository;
	
	
	
	public boolean saveLists(Lists list) {
		
		try {
			listsRepository.save(list);
			return true;
		}
		catch (Exception e) {
			return false;
		}
		
		
	}
	
	
	
	
	
	public boolean updateLists(Lists list) {
		
		try {
			listsRepository.save(list);
			return true;
		}
		catch (Exception e) {
			return false;
		}
		
		
	}
	
	
	public List<Lists> getLists(){
		
		return listsRepository.findAll();
	}
	
	
	
}
