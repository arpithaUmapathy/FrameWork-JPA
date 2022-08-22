package com.xworkz.market;

import java.time.LocalDateTime;

import com.xworkz.market.dao.MarketDAO;
import com.xworkz.market.dao.MarketDAOImpl;
import com.xworkz.market.entity.MarketEntity;
import com.xworkz.market.services.MarketService;
import com.xworkz.market.services.MarketServiceImpl;


public class MarketRunner {

	public static void main(String[] args) {
		
		MarketEntity entity=new MarketEntity("Super market", "chikmaglur", 12, 200, "Arpitha", LocalDateTime.now(), "chandru", LocalDateTime.now());
		//MarketEntity entity1=new MarketEntity("Mysore market", "Mysore", 15, 350, "Sharan", LocalDateTime.now(), "Batkhal", LocalDateTime.now());
		//MarketEntity entity2=new MarketEntity("Kanakpuram market", "kanakpura", 67, 600, "Sachin", LocalDateTime.now(), "Dodmane", LocalDateTime.now());
	//	MarketEntity entity3=new MarketEntity("Lulu market", "Banglore", 12, 200, "Chanduu", LocalDateTime.now(), "heremath", LocalDateTime.now());
		

		//System.out.println(entity);
	//	System.out.println(entity1);
	//	System.out.println(entity2);
	//	System.out.println(entity3);
		
	MarketDAO dao=new MarketDAOImpl();
//		boolean daos=dao.save(entity);
	//	System.out.println(daos);
	//boolean daos1=dao.save(entity1);
//		System.out.println(daos1);
//		boolean daos2=dao.save(entity);
//		System.out.println(daos2);
//		boolean daos3=dao.save(entity);
//		System.out.println(daos3);


	MarketService dao1 = new MarketServiceImpl();
	dao1.save(entity);
	}
}
