package com.xworkz.footballs;

public class Football {
	
	 String brand;
     double price;
	
	
	


//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public Double getPrice() {
//		return price;
//	}
//
//	public void setPrice(Double price) {
//		this.price = price;
//	}
	
	public Football(String brand) {
		//System.out.println(this.getClass().getSimpleName()+"Bean created");
		this.brand=brand;
		System.out.println("Bean Created");
		
	}
	public Football(String brand,double price) {
		this.brand= brand;
		this.price=price;
		System.out.println("Bean created");
	}
//
//	@Override
//	public String toString() {
//		return "Football [brand=" + brand + ", price=" + price + "]";
//	}
//	
//	
	
}
