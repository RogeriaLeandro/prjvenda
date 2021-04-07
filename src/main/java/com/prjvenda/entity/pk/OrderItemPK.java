package com.prjvenda.entity.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.prjvenda.entity.Customer_Orders;
import com.prjvenda.entity.Products;

@Embeddable
public class OrderItemPK implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Customer_Orders customer_orders;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Products product;

	public Customer_Orders getCustomer_orders() {
		return customer_orders;
	}

	public void setCustomer_orders(Customer_Orders customer_orders) {
		this.customer_orders = customer_orders;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderItemPK [customer_orders=" + customer_orders + ", product=" + product + "]";
	}
	
	
}
