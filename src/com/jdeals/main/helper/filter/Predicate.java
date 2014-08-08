package com.jdeals.main.helper.filter;

/**
 * The Interface Predicate.
 *
 * @param <T> the generic type
 */
public interface Predicate<T> { 
	
	/**
	 * Apply the filter using specified predicate
	 *
	 * @param type the type
	 * @return true, if successful
	 */
	boolean apply(T type); 
}



