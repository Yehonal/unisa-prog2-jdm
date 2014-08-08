package com.jdeals.main.helper.sort;

import java.util.Comparator;

import com.jdeals.main.entity.catalogue.Item;

/**
 * The Class ItemIndexSort.
 */
public class ItemIndexSort extends SortingClass<Item> {

	/**
	 * Instantiates a new item index sort.
	 * @see SortingDirection
	 * @param order the order
	 */
	public ItemIndexSort(SortingDirection order) {
		super(order);
	}

	/**
	 * @see Item
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Item o1, Item o2) {
		return this.getDirection(o1.getId()>=o2.getId());
	}
}
