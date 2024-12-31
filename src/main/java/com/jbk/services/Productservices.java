package com.jbk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.ProductDao;
import com.jbk.entity.Product;

@Service
public class Productservices {
	@Autowired
	private ProductDao productDao;
	
	public String addProduct(Product product) {
		return productDao.addProduct(product);
		
	}
//	public Optional<Product> addElementById(long pid) {
//		return productDao.getElementById(pid);
//		
//	}
	public List<Product>getelementbyoid(long pid){
		return productDao.getelementbyoid(pid);
	}
	public List<Product>getelementbyname(String pname){
		return productDao.getelementbyname(pname);
	}
	public String getupdate(long pid,Product product) {
		return productDao.getupdate(pid, product);
		
	}
	public String getDelete(long pid) {
		return productDao.getDelete(pid);
		
	}
	public List<Product> getByAll(){
		return productDao.getByAll();
		
	}
}
