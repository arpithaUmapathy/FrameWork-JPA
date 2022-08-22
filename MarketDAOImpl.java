package com.xworkz.market.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.market.entity.MarketEntity;
import com.xworkz.market.util.Factory;

public class MarketDAOImpl implements MarketDAO {
	
	EntityManagerFactory factory=Factory.getDetails();

	@Override
	public boolean save(MarketEntity marketEntity) {
		EntityManager manager=null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(marketEntity);
			tx.commit();

			
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return false;
	}

}
