package com.example.onlinerestaurantmanagement.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class CustomerEntity {
@Autowired
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int customerid;
private String customername;
private String customeremail;

@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="fk_id")
public List<ProductEntity> product;

public List<ProductEntity> getProduct() {
	return product;
}


public void setProduct(List<ProductEntity> product) {
	this.product = product;
}

public CustomerEntity() {
	super();
	// TODO Auto-generated constructor stub
}


public CustomerEntity(int customerid, String customername, String customeremail, List<ProductEntity> product) {
	super();
	this.customerid = customerid;
	this.customername = customername;
	this.customeremail = customeremail;
	
}




public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getCustomeremail() {
	return customeremail;
}
public void setCustomeremail(String customeremail) {
	this.customeremail = customeremail;
}

}

