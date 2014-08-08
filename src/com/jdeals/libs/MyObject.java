package com.jdeals.libs;

/**
 * Custom object class for Canonical methods
 * @author Giuseppe Ronca
 *
 */
public class MyObject {
	@Override
	public boolean equals(Object obj) {
		return obj!=null && obj.getClass()==this.getClass();
	}
}
