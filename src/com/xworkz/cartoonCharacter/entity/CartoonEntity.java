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

import lombok.AllArgsConstructor;
import lombok.ToString;

@Entity
@ToString(callSuper=true)
@Table(name="cartooninfo")
@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "findByName",  
	        query = "select c from CartoonEntity c where c.name=:name"  
	        ) ,
	        @NamedQuery(name = "findByNameAndGenderAndAuthor", query = "select c from CartoonEntity c where c.name=:nm and c.gender=:ge and c.authorType=:au"
	        		),
	        @NamedQuery(name="findAuthorByName", query="select c.authorType from CartoonEntity c where c.name=:name1 "),
	        
	        @NamedQuery(name="createdDateByAuthor", query="select c.createdDate from CartoonEntity c where c.authorType=:author"),
	        
            @NamedQuery(name="findNameAndGenderByAuthor", query="select cartoon.name,cartoon.gender from CartoonEntity cartoon where cartoon.authorType = :gender"),
        
            @NamedQuery(name = "findByMaxCreatedDate", query = "select max(createdDate),cartoon from CartoonEntity cartoon"),
	        
	        @NamedQuery(name="total",query="select count(*) from CartoonEntity "),
	        
	        @NamedQuery(name="updateAuthor" ,query=" update CartoonEntity c set c.authorType=:at where c.name=:nm"),
	        
	        @NamedQuery(name="updateType", query = "update CartoonEntity c set c.authorType =:type where c.name = :name"),
	        
	        @NamedQuery(name="deletebyName", query="delete from CartoonEntity c where c.name = :nme" ),
       
	        @NamedQuery(name="FindAll", query="Select c from CartoonEntity c"),
       
	        @NamedQuery(name="FindAllByAuthor", query="select cartoon from CartoonEntity cartoon where cartoon.authorType =:au"),
       
	        @NamedQuery(name="findAllByAuthorAndGender", query="select cartoon from CartoonEntity cartoon where cartoon.authorType=:au and cartoon.gender=:ge"),
       
	        @NamedQuery(name="findAllByName", query="select cartoon from CartoonEntity cartoon where cartoon.name=:nm "),
       
	        @NamedQuery(name="findAllAuthor", query="select cartoon.authorType from CartoonEntity cartoon "),
       
	        @NamedQuery(name="findAllNAndG", query="select cartoon.name,cartoon.gender from CartoonEntity cartoon"),
	        
	        @NamedQuery(name="findAllNameAndGenderAndAuthor",query="select cartoon.name,cartoon.gender,cartoon.author from CartoonEntity cartoon ")
	    
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
	private String author;

	public CartoonEntity() {	
	}

	public CartoonEntity( String name, String gender, String authorType,LocalDateTime createdDate,String createdBy,LocalDateTime updatedDate,String updatedBy) {
		super(createdDate,createdBy,updatedDate,updatedBy);
		//this.id = id;
		this.name = name;
		this.gender = gender;
		this.author = authorType;
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
		return author;
	}

	public void setAuthorType(String authorType) {
		this.author = authorType;
	}


	

}
