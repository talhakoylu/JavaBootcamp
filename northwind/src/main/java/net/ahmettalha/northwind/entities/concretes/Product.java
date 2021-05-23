package net.ahmettalha.northwind.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;

//	We used @NoArgsConstructor instead of this code block
//	public Product() {
//	}
//
//	We used @AllArgsConstructor instead of this code block
//	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
//				   String quantityPerUnit) {
//		super();
//		this.id = id;
//		this.categoryId = categoryId;
//		this.productName = productName;
//		this.unitPrice = unitPrice;
//		this.unitsInStock = unitsInStock;
//		this.quantityPerUnit = quantityPerUnit;
//	}
	
}
