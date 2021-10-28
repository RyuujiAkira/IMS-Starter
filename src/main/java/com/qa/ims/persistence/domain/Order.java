package com.qa.ims.persistence.domain;

public class Order {
	private Long id;
	private Long customerID;
	private Long productID;
	private Long quantity;
	private Double price;
	private Long orderID;
	
	public Order(Long customerID) {
		this.setCustomerID(customerID);
	}
	
	public Order(Long id, Long customerID) {
		this.setId(id);
		this.setCustomerID(customerID);
	}

	public Order(Long id, Long customerID, Long productID, Long quantity, Double price, Long orderID) {
		this.setId(id);
		this.setCustomerID(customerID);
		this.setProductID(productID);
		this.setQuantity(quantity);
		this.setPrice(price);
		this.setOrderID(orderID);
	}
	
	public Order(Long productID, Long quantity,Long orderID) {
		this.setProductID(productID);
		this.setQuantity(quantity);
		this.setOrderID(orderID);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}
	
	public Long getProductID() {
		return productID;
	}

	public void setProductID(Long productID) {
		this.productID = productID;
	}
	
	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	@Override
	public String toString() {
		return "id:" + id + " customer id:" + customerID + " product id:" + productID + " quantity:" + quantity + " price:" + price + " order id:" + orderID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((productID == null) ? 0 : productID.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customerID == null) {
			if (other.customerID != null)
				return false;
		} else if (!customerID.equals(other.customerID))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (productID == null) {
			if (other.productID != null)
				return false;
		} else if (!productID.equals(other.productID))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		return true;
	}
}
