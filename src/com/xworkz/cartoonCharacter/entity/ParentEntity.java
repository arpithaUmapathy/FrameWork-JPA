package com.xworkz.cartoonCharacter.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;



@MappedSuperclass
public class ParentEntity {
	
	private LocalDateTime createdDate;
	private String createdBy;
	private LocalDateTime updatedDate;
	
	private String updatedBy;
	
	
	public ParentEntity() {
	}


	public ParentEntity(LocalDateTime createdDate, String createdBy, LocalDateTime updatedDate, String updatedBy) {
		super();
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}


	public LocalDateTime getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}


	public String getUpatedBy() {
		return updatedBy;
	}


	public void setUpatedBy(String upatedBy) {
		this.updatedBy = upatedBy;
	}


	@Override
	public String toString() {
		return "ParentEntity [createdDate=" + createdDate + ", createdBy=" + createdBy + ", updatedDate=" + updatedDate
				+ ", updatedBy=" + updatedBy + "]";
	}
	
	
	

}
