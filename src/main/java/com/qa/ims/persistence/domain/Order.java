package com.qa.ims.persistence.domain;

public class Order {
	private Long id;
	private Long customerID;
	private Long orderItemsID;
	
	public Order(Long customerID, Long orderItemsID) {
		this.setCustomerID(customerID);
		this.setOrderItemsID(orderItemsID);
	}

	public Order(Long id, Long customerID, Long orderItemsID) {
		this.setId(id);
		this.setCustomerID(customerID);
		this.setOrderItemsID(orderItemsID);
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
	
	public Long getOrderItemsID() {
		return orderItemsID;
	}

	public void setOrderItemsID(Long orderItemsID) {
		this.orderItemsID = orderItemsID;
	}

	@Override
	public String toString() {
		return "id:" + id + " customer id:" + customerID + " order items id:" + orderItemsID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orderItemsID == null) ? 0 : orderItemsID.hashCode());
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
		if (orderItemsID == null) {
			if (other.orderItemsID != null)
				return false;
		} else if (!orderItemsID.equals(other.orderItemsID))
			return false;
		return true;
	}
}
