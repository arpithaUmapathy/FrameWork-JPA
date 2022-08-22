package com.xworkz.market.services;



import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import com.xworkz.market.dao.MarketDAO;
import com.xworkz.market.dao.MarketDAOImpl;
import com.xworkz.market.entity.MarketEntity;
import com.xworkz.market.util.Factory;
import com.xworkz.market.util.Validation;

public class MarketServiceImpl implements  MarketService {

	MarketDAO dao = new MarketDAOImpl();

	
	ValidatorFactory factory= Validation.getFactory();


	@Override
	public boolean save(MarketEntity marketEntity) {
		javax.validation.Validator validator = factory.getValidator();
		Set<ConstraintViolation<MarketEntity>> violation = validator.validate(marketEntity);
		if(violation.size() > 0) {
			
			System.out.println("Invalid Detais");
//            for (ConstraintViolation<MarketEntity> violation2 : violation) {
//                System.out.println(violation2.getMessage());
        } else {
            System.out.println("Valid Object");
            dao.save(marketEntity);
        }
		return false;
	}
		
}

	
	
	