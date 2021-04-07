package com.prjvenda.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.prjvenda.entity.pk.OrderItemPK;

@Entity
@Table(name = "customer_orders_products")
public class Customer_Orders_Products {

	@EmbeddedId
	private OrderItemPK order_id = new OrderItemPK();
	
	private Integer quantity;
	private String comments;
	
	public Customer_Orders_Products() {
		
	}

	public Customer_Orders_Products(Customer_Orders order, Products product, Long product_id, Integer quantity, String comments) {
		super();
		
		order_id.setCustomer_orders(order);
		order_id.setProduct(product);
		//this.order_id = order_id;
		//this.product_id = product_id;
		this.quantity = quantity;
		this.comments = comments;
	}


	public Customer_Orders getOrder() {
		return order_id.getCustomer_orders();
	}
	
	public void setOrder(Customer_Orders order) {
		order_id.setCustomer_orders(order);
	}
	
	public Products getProduct() {
		return order_id.getProduct();
	}
	
	public void setProducts(Products product) {
		order_id.setProduct(product);
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
		return "Customer_Orders_Products [id=" + order_id + ", quantity=" + quantity + ", comments=" + comments + "]";
	}


	
}
