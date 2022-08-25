package com.xworkz.footballs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootBallRunner {
	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
		System.out.println(container);
		
		
		Football football = container.getBean(Football.class);
		System.out.println("FootBall Brand="+football.brand);
		System.out.println("FootBall Price="+football.price);
		
		Integer integer = container.getBean(Integer.class);
		System.out.println("Integer value ="+integer);
		
		String string = container.getBean(String.class);
		System.out.println("String value="+string);
		
		Float float1 = container.getBean(Float.class);
		System.out.println("Float value="+float1);
		
		Double double1 = container.getBean(Double.class);
		System.out.println("Double value="+double1);
		
		Short short1 = container.getBean(Short.class);
		System.out.println("Short value="+short1);

		
		
		
		//Integer intg=new Integer(0);
		
		
		
		

//		String str = container.getBean(String.class);
//		System.out.println(str);
//		
//		
//		Integer inr = container.getBean(Integer.class);
//		System.out.println(inr);
//
//		Double dob = container.getBean(Double.class);
//		System.out.println(dob);
//		
//
//		Float flo = container.getBean(Float.class);
//		System.out.println(flo);
//		
//
//		Boolean bol = container.getBean(Boolean.class);
//		System.out.println(bol);
//		
//
//		Character ch = container.getBean(Character.class);
//		System.out.println(ch);
	}

}
