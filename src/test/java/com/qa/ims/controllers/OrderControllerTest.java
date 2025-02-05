package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.OrderController;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.OrderItems;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private OrderDAO dao;

	@InjectMocks
	private OrderController controller;

	@Test
	public void testCreate() {
		final Long C_ID = 1L;
		final Order created = new Order(C_ID);

		Mockito.when(utils.getLong()).thenReturn(C_ID);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}

	@Test
	public void testReadAll() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1L, 1L));

		Mockito.when(dao.readAll()).thenReturn(orders);

		assertEquals(orders, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll();
	}

	@Test
	public void testUpdate() {
		Order updated = new Order(1L, 1L);

		Mockito.when(this.utils.getLong()).thenReturn(1L, updated.getCustomerID());
		Mockito.when(this.dao.update(updated)).thenReturn(updated);

		assertEquals(updated, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(2)).getLong();
		Mockito.verify(this.dao, Mockito.times(1)).update(updated);
	}

	@Test
	public void testDelete() {
		final long ID = 1L;

		Mockito.when(utils.getLong()).thenReturn(ID);
		Mockito.when(dao.delete(ID)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(ID);
	}
	
//	@Test
//	public void testAddItem() { 
//		final long productID = 1L;
//		final long quantity = 2L;
//		final long orderID = 1L;
//		final OrderItems addedItem = new OrderItems(productID, quantity, orderID);
//
//		Mockito.when(utils.getLong()).thenReturn(productID, quantity, orderID);
//		Mockito.when(this.dao.addItemToOrder(addedItem)).thenReturn(addedItem);
//
//		assertEquals(addedItem, controller.addItemOrder());
//
//		Mockito.verify(utils, Mockito.times(3)).getLong();
//		Mockito.verify(dao, Mockito.times(1)).addItemToOrder(addedItem);
//	}
//	
//	@Test
//	public void testDeleteItem() {
//		final long ID = 1L;
//
//		Mockito.when(utils.getLong()).thenReturn(ID);
//		Mockito.when(dao.deleteItemFromOrder(ID)).thenReturn(1);
//
//		assertEquals(1L, this.controller.deleteItemOrder());
//
//		Mockito.verify(utils, Mockito.times(1)).getLong();
//		Mockito.verify(dao, Mockito.times(1)).delete(ID);
//	}
//	
//	@Test
//	public void testCaluclateOrder() {
//		final long ID = 1L;
//
//		Mockito.when(utils.getLong()).thenReturn(ID);
//		Mockito.when(dao.delete(ID)).thenReturn(1);
//
//		assertEquals(1L, this.controller.delete());
//
//		Mockito.verify(utils, Mockito.times(1)).getLong();
//		Mockito.verify(dao, Mockito.times(1)).delete(ID);
//	}
}
