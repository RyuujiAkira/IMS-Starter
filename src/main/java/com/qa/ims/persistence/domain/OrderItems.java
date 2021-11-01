package com.qa.ims.persistence.domain;

public class OrderItems {
	private Long id;
	private Long productID;
	private Long quantity;
	private Double orderTotal;
	private Long orderID;
	
	public OrderItems(Long id, Long productID, Long quantity, Double orderTotal, Long orderID) {
		this.setId(id);
		this.setProductID(productID);
		this.setQuantity(quantity);
		this.setOrderTotal(orderTotal);
		this.setOrderID(orderID);
	}
	
	public OrderItems(Long productID, Long quantity, Long orderID) {
		this.setProductID(productID);
		this.setQuantity(quantity);
		this.setOrderID(orderID);
	}
	
	public OrderItems(Long productID, Long orderID) {
		this.setProductID(productID);
		this.setOrderID(orderID);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public Double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}
	
	@Override
	public String toString() {
		return "id:" + id + " product id:" + productID + " quantity:" + quantity + " order total:" + orderTotal + " order id:" + orderID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productID == null) ? 0 : productID.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((orderTotal == null) ? 0 : orderTotal.hashCode());
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
		OrderItems other = (OrderItems) obj;
		if (productID == null) {
			if (other.productID != null)
				return false;
		} else if (!productID.equals(other.productID))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (orderTotal == null) {
			if (other.orderTotal != null)
				return false;
		} else if (!orderTotal.equals(other.orderTotal))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		return true;
	}
}
