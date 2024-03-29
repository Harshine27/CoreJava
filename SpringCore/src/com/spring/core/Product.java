package com.spring.core;

public class Product { // pojo
	private int productId;
	private String productName;
	private String productDesc;
	private int productPrice;

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", productPrice=" + productPrice + "]";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, String productDesc, int productPrice) {
		super();
		System.out.println("This is constructor");
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
	}

}
