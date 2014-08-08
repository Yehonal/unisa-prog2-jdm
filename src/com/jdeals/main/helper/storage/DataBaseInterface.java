package com.jdeals.main.helper.storage;

import java.util.ArrayList;

/**
 * The Interface DataBaseInterface.
 *
 * @param <T> the generic type
 */
public interface DataBaseInterface <T>{
	
	/**
	 * Store list.
	 *
	 * @param list the list
	 * @param filePath the file path
	 */
	public void storeList(ArrayList<T> list,String filePath);
	
	/**
	 * Load list.
	 *
	 * @param filePath the file path
	 * @return the array list
	 */
	public ArrayList<T> loadList(String filePath);
}
