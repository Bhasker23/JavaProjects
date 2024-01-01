package com.multipleDb.service;

import org.springframework.stereotype.Service;

import com.multipleDb.db2entity.Product;

@Service
public interface ProductInr {

	Product addProduct(Product product);
	
}
