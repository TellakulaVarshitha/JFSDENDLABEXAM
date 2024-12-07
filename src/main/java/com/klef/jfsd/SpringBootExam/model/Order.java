package com.klef.jfsd.SpringBootExam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order_table")
public class Order 
{
	   @Id
	   @Column(name="customer_id")
	   private int id;
	   @Column(name="order_name",nullable=false,length = 50)
	   private String name;
	   @Column(name="order_quantity",nullable=false)
	   private int quantity;
	   @Column(name="order_date",nullable=false)
	   private String date;
	   @Column(name="customer_name",nullable=false,length = 30)
	   private String customerName;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	   
}
