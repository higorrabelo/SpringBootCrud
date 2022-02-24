package com.higor.lessons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higor.lessons.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
	
	

}
