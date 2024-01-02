package com.multipleDb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multipleDb.db2entity.Product;
import com.multipleDb.db2repo.ProductRepo;

@Service
public class ProductImpl implements ProductInr{

	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public Product addProduct(Product product) {
		
		Product product2 = new Product();
		
		product2.setId(product.getId());
		product2.setName(product.getName());
		
		productRepo.save(product);
		return product2;
	}

}
