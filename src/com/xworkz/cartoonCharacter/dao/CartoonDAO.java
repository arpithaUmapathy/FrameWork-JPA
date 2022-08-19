package com.xworkz.cartoonCharacter.dao;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

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
	
	void updateTypeByName(String name,String type);
	
	void  deleteByName(String name);
	
	default List<CartoonEntity> findAll(){
		return Collections.emptyList();
	}
	
	default List<CartoonEntity> findAllByAuthor(String author){
		return Collections.emptyList();
	}
	
	
	default List<CartoonEntity> findAllByAuthorAndGender(String author,String gender){
		return Collections.emptyList();
	}
	
	
	default List<CartoonEntity> findAllByName(String name){
		return Collections.emptyList();
	}
	
	default List<CartoonEntity> findAllAuthor(){
		return Collections.emptyList();
	}
	
	default List<Object[]> findAllNameAndGender(){
		return Collections.emptyList();
	}
	
	default List<Object[]> findAllNameAndGenderAndAuthor(){
		return Collections.emptyList();
	}
	
}

