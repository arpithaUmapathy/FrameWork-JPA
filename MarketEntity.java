package com.xworkz.market.entity;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.ToString;


@Entity
@ToString(callSuper = true)
@Table(name="marketinfo")
public class MarketEntity extends ParentEntity{
	@GenericGenerator(name = "nane" ,strategy="increment")
	@GeneratedValue(generator = "nane")
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="noOfStalls")
	private int noOfStalls;
	@Column(name="maxCapacity")
	private int maxCapacity;
	
	public MarketEntity() {
		
	}

	public MarketEntity( String name, String location, int noOfStalls, int maxCapacity ,String createdBy,LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate ) {
		super(createdBy,createdDate,updatedBy,updatedDate);
		//this.id = id;
		this.name = name;
		this.location = location;
		this.noOfStalls = noOfStalls;
		this.maxCapacity = maxCapacity;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(int noOfStalls) {
		this.noOfStalls = noOfStalls;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	@Override
	public String toString() {
		return "MarketEntity [id=" + id + ", name=" + name + ", location=" + location + ", noOfStalls=" + noOfStalls
				+ ", maxCapacity=" + maxCapacity + "]";
	}
	
	
	

}
