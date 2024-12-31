package com.jbk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private long pid;
	private String pname;
	private int pQty;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long pid, String pname, int pQty, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pQty = pQty;
		this.price = price;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pQty=" + pQty + ", price=" + price + "]";
	}
	
	

}
