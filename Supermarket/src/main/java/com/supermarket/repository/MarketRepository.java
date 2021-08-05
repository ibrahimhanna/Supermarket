package com.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.supermarket.model.Market;

@Repository
public interface MarketRepository  extends JpaRepository<Market, Long> {

	
	
	
	
	
}
