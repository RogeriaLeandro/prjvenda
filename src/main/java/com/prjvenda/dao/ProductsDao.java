package com.prjvenda.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prjvenda.entity.Products;

@Repository
public interface ProductsDao extends CrudRepository<Products, Integer> {
	
	
}
