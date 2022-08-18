package com.xworkz.cartoonCharacter.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity

@Table(name="cartooninfo")
@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "findByName",  
	        query = "select c from CartoonEntity c where c.name=:name"  
	        ) ,
//	        @NamedQuery(name = "findByNameAndGenderAndAuthor", query = "select c from CartoonEntity c where c.name=:nm and c.gender=:ge and c.authorType=:au"
//	        		),
//	        @NamedQuery(name="findAuthorByName", query="select c.authorType from CartoonEntity c where c.name=:name1 "),
//	        
//	        @NamedQuery(name="createdDateByAuthor", query="select c.createdDate from CartoonEntity c where c.authorType=:author"),
//	        
//	        @NamedQuery(name="findNameAndGenderByAuthor", query="select cartoon.name,cartoon.gender from CartoonEntity cartoon where cartoon.authorType = :gender"),
//	        
//	        @NamedQuery(name = "findByMaxCreatedDate", query = "Select c from CartoonEntity where c.createdDate = (select MAX(createdDate)"),
//	        
//	        @NamedQuery(name="total",query="select count(*) from CartoonEntity "),
	        
	        @NamedQuery(name="updateAuthor" ,query=" update CartoonEntity c set c.authorType=:at where c.name=:nm")
	        
	        
	    }  
	)  
public class CartoonEntity extends ParentEntity{
	
	@GenericGenerator(name = "nane" ,strategy="increment")
	@GeneratedValue(generator = "nane")
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	@Column(name="authorType")
	private String authorType;

	public CartoonEntity() {	
	}

	public CartoonEntity( String name, String gender, String authorType,LocalDateTime createdDate,String createdBy,LocalDateTime updatedDate,String updatedBy) {
		super(createdDate,createdBy,updatedDate,updatedBy);
		//this.id = id;
		this.name = name;
		this.gender = gender;
		this.authorType = authorType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAuthorType() {
		return authorType;
	}

	public void setAuthorType(String authorType) {
		this.authorType = authorType;
	}

	@Override
	public String toString() {
		return "CartoonEntity [id=" + id + ", name=" + name + ", gender=" + gender + ", authorType=" + authorType + "]";
	}
	
	

}
