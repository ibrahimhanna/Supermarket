package com.supermarket;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.supermarket.model.Market;
import com.supermarket.services.MarketService;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SupermarketApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

    @Autowired
	MarketService marketService; 
    
    
    
	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/hello",
				String.class)).contains("hello");
	}
	
	
	 @Test
	    public void testSaveMarket() throws Exception {
		 
		    Market market = new Market();
		           market.setArabic_name("متجر");
		           market.setEnglishname("market");
		           market.setImage_path("C:\\Users\\ibrahim\\Desktop\\sea.jpg");
		 
		    marketService.saveMarket(market);
	        Market market2 = marketService.getMarket("market");
	        assertThat(market2.getEnglishname()).isEqualTo("market");
	        
	    }

	
	 
	 
	
}
