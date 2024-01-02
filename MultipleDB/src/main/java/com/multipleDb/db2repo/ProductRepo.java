package com.multipleDb.db2repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multipleDb.db2entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
