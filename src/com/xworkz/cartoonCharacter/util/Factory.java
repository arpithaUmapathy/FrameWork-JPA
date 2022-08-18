package com.xworkz.cartoonCharacter.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Factory {
	
private static EntityManagerFactory factory;
	
	
	public static EntityManagerFactory getDetails() {
		return factory;
	}
	
	static {
		factory = Persistence.createEntityManagerFactory("com.xworkz");
	}

}
