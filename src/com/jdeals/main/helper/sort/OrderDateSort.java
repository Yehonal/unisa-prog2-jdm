package com.jdeals.main.helper.sort;

import java.util.Comparator;

import com.jdeals.main.entity.Order;
import com.jdeals.main.entity.catalogue.Item;

/**
 * The Class OrderDateSort.
 */
public class OrderDateSort  extends SortingClass<Order>{

	/**
	 * Instantiates a new order date sort.
	 * @see SortingDirection
	 * @param order the order
	 */
	public OrderDateSort(SortingDirection order) {
		super(order);
	}

	/**
	 * Order
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Order o1, Order o2) {
		return this.getDirection(o1.getDate().getDate().before(o2.getDate().getDate()));
	}
}
