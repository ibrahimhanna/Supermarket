package com.supermarket.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.model.Market;
import com.supermarket.repository.MarketRepository;

@Service
public class MarketService {

	
	@Autowired
	MarketRepository marketRepository;
	
	
	public boolean saveMarket(Market market) {
		
		try {
			
			marketRepository.save(market);
			
			return true;
		}
		catch (Exception e) {
			return false;
		}
		
	}
	
	
	
	
	
	
	
}
