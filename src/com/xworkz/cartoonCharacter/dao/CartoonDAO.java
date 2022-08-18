package com.xworkz.cartoonCharacter.dao;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import com.xworkz.cartoonCharacter.entity.CartoonEntity;

public interface CartoonDAO {

	boolean save(CartoonEntity entity);
	
	CartoonEntity findByName(String name);
	
	default CartoonEntity findByNameAndGenderAndAuthor(String name,String gender,String author) {
		return null;
	}
	
	
	
	default String findAuthorByName(String name) {
		return null;
	}
	
	
	default LocalDateTime createdDateByAuthor(String name) {
		return null;
	}
	
	default Object[] findNameAndGenderByAuthor(String author) {
		return null;
	}
	
	default CartoonEntity findByMaxCreatedDate() {
		return null;
	}
	
	
	Integer total();
	
	
	void updateAuthorByName(String author, String name);
	
}

