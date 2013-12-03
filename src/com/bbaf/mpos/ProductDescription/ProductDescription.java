package com.bbaf.mpos.ProductDescription;

import java.io.Serializable;

import com.bbaf.mpos.sale.SaleLineItem;

import android.util.Log;

public class ProductDescription implements Serializable {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() == obj.getClass()) {
			ProductDescription product = (ProductDescription)obj;
			return id.equals(product.getId());
		}
		else if (SaleLineItem.class == obj.getClass()) {
			SaleLineItem line = (SaleLineItem)obj;
			return id.equals(line.getProductDescription().getId());
		}
		
		return false;
	}

	private int key;
	private String id;
	private String name;
	private double price;
	private double cost;
	private String dateModified;
	
	public ProductDescription(int key, String id, String name, double price, double cost, String dateModified) {
		this.key = key;
		this.id = id;
		this.name = name;
		this.price = price;
		this.cost = cost;
		this.dateModified = dateModified;
	}
	
	public ProductDescription(String id, String name, double price, double cost) {
		this(0, id, name, price, cost, "");
	}
	
	public int getKey() {
		return key;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getCost() {
		return cost;
	}
	
	public String getDateModified() {
		return dateModified;
	}
}
