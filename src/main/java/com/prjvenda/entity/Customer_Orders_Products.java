package com.prjvenda.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.prjvenda.entity.pk.OrderItemPK;

@Entity
@Table(name = "customer_orders_products")
public class Customer_Orders_Products {

	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	private Integer quantity;
	private String comments;
	
	public Customer_Orders_Products() {
		
	}

	public Customer_Orders_Products(Customer_Orders order, Products product, Long product_id, Integer quantity, String comments) {
		super();
		
		id.setCustomer_orders(order);
		id.setProduct(product);
		//this.order_id = order_id;
		//this.product_id = product_id;
		this.quantity = quantity;
		this.comments = comments;
	}


	public Customer_Orders getOrder() {
		return id.getCustomer_orders();
	}
	
	public void setOrder(Customer_Orders order) {
		id.setCustomer_orders(order);
	}
	
	public Products getProduct() {
		return id.getProduct();
	}
	
	public void setProducts(Products product) {
		id.setProduct(product);
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Customer_Orders_Products [id=" + id + ", quantity=" + quantity + ", comments=" + comments + "]";
	}


	
}
