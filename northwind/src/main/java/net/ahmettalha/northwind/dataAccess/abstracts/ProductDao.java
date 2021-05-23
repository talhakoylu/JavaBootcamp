package net.ahmettalha.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ahmettalha.northwind.entities.concretes.Product;

//integer is the type of primary key field of the Products Table
public interface ProductDao extends JpaRepository<Product, Integer>{
	
}
