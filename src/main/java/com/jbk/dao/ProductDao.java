package com.jbk.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Product;

@Repository
public class ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public String addProduct(Product product) {
		Session session = sessionFactory.openSession();
		session.save(product);
		session.beginTransaction().commit();
		
		return "Added";
		
	}

	public List<Product>getelementbyoid(long pid){
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria c=session.createCriteria(Product.class);
		c.add(Restrictions.eq("pid", pid));
		List plist=c.list();
		tx.commit();
		return plist;
	}
	public List<Product>getelementbyname(String pname){
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria c=session.createCriteria(Product.class);
		c.add(Restrictions.eq("pname", pname));
		List plist=c.list();
		tx.commit();
		return plist;
	}
	public String getupdate(long pid,Product product) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria c=session.createCriteria(Product.class);
		session.update(product);
		tx.commit();
		return "Product Updated";
		
	}
	public String getDelete(long pid) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Product product = session.get(Product.class, pid);
		//session.get(Product.class, pid);
		session.delete(product);
		tr.commit();

		return "Delete Product";
	}
	public List<Product> getByAll(){
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Criteria c=session.createCriteria(Product.class);
		List plist=c.list();
		
		return plist;
		
		
	}
}
