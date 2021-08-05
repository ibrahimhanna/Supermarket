package com.supermarket.controller;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.supermarket.model.Market;
import com.supermarket.services.MarketService;

@RestController
public class AdminController {

	
	@Autowired
	MarketService marketService;
	
	
	@PostMapping(path= "/register_market", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> registerMarket(@RequestBody Market market){
	
		
		File file = new File(market.getImage_path());
        byte[] bFile = new byte[(int) file.length()];
        
        try {
         FileInputStream fileInputStream = new FileInputStream(file);
         //convert file into array of bytes
         fileInputStream.read(bFile);
         fileInputStream.close();
        } catch (Exception e) {
         e.printStackTrace();
        }
        
        
        market.setImage(bFile);
		
		
		if(marketService.saveMarket(market)) {
			 return new ResponseEntity<>(market, HttpStatus.CREATED);
		}
		else {
			 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	
	@RequestMapping(path="/hello" , method=RequestMethod.GET)
	public String hello() {
		return "hello";
		}
	
	
	
	
}
