package com.jdeals.libs;

import java.lang.reflect.Method;

/**
 * Formal class to throw a simple message instead Exception.
 *
 * @author Giuseppe Ronca
 */
public class Message extends RuntimeException {
	
	/**
	 * Instantiates a new message.
	 */
	public Message() {
		super();
	}
	
	/**
	 * Instantiates a new message.
	 *
	 * @param s the s
	 */
	public Message(String s) {
		super(s);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		return this.getMessage();
	}
	
}
