package com.xworkz.cartoonCharacter.dao;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.cartoonCharacter.entity.CartoonEntity;
import com.xworkz.cartoonCharacter.util.Factory;

public class CartoonDAOImpl implements CartoonDAO {

	EntityManagerFactory factory = Factory.getDetails();

	@Override
	public boolean save(CartoonEntity entity) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();

		}

		catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return false;
	}

	@Override
	public CartoonEntity findByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("name", name);
			Object obj = query.getSingleResult();
			if (obj != null) {
				CartoonEntity entity = (CartoonEntity) obj;
				return entity;
			}

		}

		catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonEntity findByNameAndGenderAndAuthor(String name, String gender, String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameAndGenderAndAuthor");
			query.setParameter("nm", name);
			query.setParameter("ge", gender);
			query.setParameter("au", author);
			Object object = query.getSingleResult();

			CartoonEntity entity = (CartoonEntity) object;
			return entity;

		}

		catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
		// return CartoonDAO.super.findByNameAndGenderAndAuthor(name, gender, author);
	}
	
	@Override
	public String findAuthorByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAuthorByName");
			query.setParameter("name1", name);
			String str = (String) query.getSingleResult();
			if (str != null) {
				String entity = (String) str;
				return name;
			}

		}

		catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		
		return CartoonDAO.super.findAuthorByName(name);
	}
	
	
	
	@Override
	public LocalDateTime createdDateByAuthor(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("createdDateByAuthor");
			query.setParameter("author", name);
			LocalDateTime local = (LocalDateTime) query.getSingleResult();
			if (local != null) {
				LocalDateTime entity = (LocalDateTime) local;
				return entity;
						
			}

		}

		catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		
	}
		return CartoonDAO.super.createdDateByAuthor(name);
	}
	
	
	
	@Override
	public Object[] findNameAndGenderByAuthor(String author) {
		EntityManager manager = null;
		try{
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findNameAndGenderByAuthor");
			query.setParameter("gender", author);
			Object obj = query.getSingleResult();
			Object[] result = (Object[])obj;
			return result;
					
		}
		catch (PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return CartoonDAO.super.findNameAndGenderByAuthor(author);
	}
	
	
	@Override
	public CartoonEntity findByMaxCreatedDate() {
		EntityManager manager = null;
		try{
			
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByMaxCreatedDate");
			Object obj = query.getSingleResult();
			if(obj != null) {
				CartoonEntity cartoon = (CartoonEntity)obj;
				return cartoon;	
			}
			else {
				System.out.println("Unable To Find");
			}
					
		}
		catch (PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return CartoonDAO.super.findByMaxCreatedDate();
	}

	@Override
	public Integer total() {
		EntityManager manager = null;
		try{
			
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("total");
			Object obj = query.getSingleResult();
			System.out.println(obj);
		}
		catch (PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateAuthorByName(String author, String name) {
		EntityManager manager = null;
		try{
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateAuthor");
			query.setParameter("at", author);
			query.setParameter("nm", name);
			query.executeUpdate();
			System.out.println("The Updated Values of Author are:" + author );
			tx.commit();
		}
		catch (PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		
	}
}

			
	//	return CartoonDAO.super.findNameAndGenderByAuthor(author);
	


