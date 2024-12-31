package com.jbk.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Product;
import com.jbk.services.Productservices;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private Productservices productservices;
	@PostMapping("/add")
	public String addProduct(@RequestBody Product product) {
		return productservices.addProduct(product);
		
	}

	@GetMapping("/getelementbyid/{pid}")
	public List<Product>getelementbyoid(@PathVariable long pid){
		return productservices.getelementbyoid(pid);
	}
	@GetMapping("/getelementbyname/{pname}")
	public List<Product>getelementbyname(@PathVariable String pname){
		return productservices.getelementbyname(pname);

	}
	@PutMapping("getupdate/{pid}")
	public String getupdate(@RequestBody Product product,@PathVariable long pid) {
		return productservices.getupdate(pid, product);
		
	}
	@DeleteMapping("/getdeletebyid/{pid}")
	public String getdelete(@PathVariable("pid") long pid) {
		return productservices.getDelete(pid);
		
	}
	@GetMapping("/getAllBy")
	public List<Product> getAllBy(){
		return productservices.getByAll();
		
	}
}