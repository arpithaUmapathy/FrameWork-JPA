package com.xworkz.market.util;

import javax.validation.ValidatorFactory;

public class Validation {

private static ValidatorFactory factory;
	
	public static ValidatorFactory getFactory() {
		return factory;		
	}
	
	static {
		
		factory = javax.validation.Validation.buildDefaultValidatorFactory();
	}
}
