package com.xworkz.cartoonCharacter;

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.cartoonCharacter.dao.CartoonDAO;
import com.xworkz.cartoonCharacter.dao.CartoonDAOImpl;
import com.xworkz.cartoonCharacter.entity.CartoonEntity;

public class CartoonRunner {

	public static void main(String[] args) {

		CartoonEntity entity = new CartoonEntity("Tom and Jerry", "Male", "Arpitha", LocalDateTime.now(), "arpi",
				LocalDateTime.now(), "arpi");
		CartoonEntity entity1= new CartoonEntity("Mr_bean", "Male", "Arpitha", LocalDateTime.now(), "arpi",
				LocalDateTime.now(), "arpi");
		CartoonEntity entity2 = new CartoonEntity("Oggy and the cockroaches", "Male", "Arpitha", LocalDateTime.now(), "arpi",
				LocalDateTime.now(), "arpi");
		CartoonEntity entity3 = new CartoonEntity("Krishna aur Balram", "Male", "Arpitha", LocalDateTime.now(), "arpi",
				LocalDateTime.now(), "arpi");
		CartoonEntity entity4 = new CartoonEntity("Dora", "Female", "Arpitha", LocalDateTime.now(), "arpi",
				LocalDateTime.now(), "arpi");
	
		System.out.println(entity);
		System.out.println(entity1);
		System.out.println(entity2);
		System.out.println(entity3);
		System.out.println(entity4);
 CartoonEntity cartoonEntity = new CartoonEntity("chandru", "male", "sathya",
 LocalDateTime.now(), "chin",
 LocalDateTime.now(), "m");
 
 System.out.println(cartoonEntity);

	CartoonDAO dao = new CartoonDAOImpl();
	boolean b = dao.save(entity);
		System.out.println(b);
		boolean b1 = dao.save(entity1);
		System.out.println(b1);
		boolean b2 = dao.save(entity2);
		System.out.println(b2);
		boolean b3 = dao.save(entity3);
		System.out.println(b3);
		boolean b4 = dao.save(entity4);
		System.out.println(b4);
	
	
	boolean b5=dao.save(cartoonEntity);
	System.out.println(b5);
	
		dao.save(entity);

		 CartoonEntity entity01 = dao.findByName("chandru");
		 System.out.println(entity01);

		CartoonEntity entity02 = dao.findByNameAndGenderAndAuthor("chandru", "male", "sathya");
		System.out.println(entity02);
		
		String entity03 = dao.findAuthorByName("chandru");
		System.out.println(entity03);
		
		
		
		LocalDateTime entity04 = dao.createdDateByAuthor("sathya");
		System.out.println(entity04);
		
		

		Object[] entity05 = dao.findNameAndGenderByAuthor("sathya");
		System.out.println(entity05[0]);
		System.out.println(entity05[1]);
		
		CartoonEntity row = dao.findByMaxCreatedDate();
		System.out.println(row);
		
		// Integer inti =dao.total();
		// System.out.println(dao.total());
		 
		 
		// dao.updateAuthorByName("chandu","Doremon");
		
		//dao.updateTypeByName("Sharan","chandru");
		
		//dao.deleteByName("chandru");
		
	
	//dao.findAll().forEach(System.out::println);
	
	//dao.findAllByAuthor("sathya").forEach(System.out::println);
	
//dao.findAllByAuthorAndGender("sathya", "male").forEach(System.out::println);
	
	//dao.findAllByName("chandru").forEach(System.out::println);
	
	//dao.findAllNameAndGender().forEach(obj->System.out.println(obj[0]+"::"+obj[1]));
	
	dao.findAllNameAndGenderAndAuthor().forEach(obj->System.out.println(obj[0]+"::"+ obj[1]+"::"+obj[2]));;
	
	}

	}


