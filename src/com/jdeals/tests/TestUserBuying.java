package com.jdeals.tests;

import com.jdeals.main.controller.JDealsController;
import com.jdeals.main.controller.Store;
import com.jdeals.main.entity.Order;
import com.jdeals.main.entity.user.User;

public class TestUserBuying {
	public static void main(String[] args) {
		JDealsController instance = new JDealsController();
		
		try {
			TestDemoData.importExampleData(instance);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		User user=instance.findUser("user");
		instance.setCurUser(user);
		
		// sets user credit
		user.modCredit(1000);
		
		Store store=instance.getStore();
		
		try {
			// EXPIRED TRAVEL
			store.addItemToCart(store.getItem(1), 1);
			store.payOrder();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			// AVAILABLE GENERAL GOOD
			store.addItemToCart(store.getItem(4), 1);
			store.payOrder();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (Order o : user.getOrders()) {
			System.out.println(o);
		}
	}
}
