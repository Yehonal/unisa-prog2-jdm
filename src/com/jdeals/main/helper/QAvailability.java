package com.jdeals.main.helper;

/**
 * Quantity Availability interface.
 *
 * @author Giuseppe Ronca
 */
public interface QAvailability extends Availability{
	
	/**
	 * check if a specified quantity is available.
	 *
	 * @param quantity the quantity
	 * @return true, if is available
	 */
	public boolean isAvailable(int quantity);
}
