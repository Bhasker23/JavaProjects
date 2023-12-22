package com.productapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.models.Product;

import jakarta.transaction.Transactional;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void createProduct(Product product) {

		this.hibernateTemplate.save(product);
	}
	
	public Product getProduct(int id) {
		
		 Product product = this.hibernateTemplate.get(Product.class, id);
		 return product;
	}

	public List<Product> getListProducts() {

		List<Product> productList = this.hibernateTemplate.loadAll(Product.class);
		return productList;
	}
	
	
	@Transactional
	public void deleteProduct(int productId) {
		
		Product product = this.hibernateTemplate.load(Product.class, productId);
		this.hibernateTemplate.delete(product);
	}
}
