package com.core.theatre;


public class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2547740073495611554L;
	private int hour;
	private int min;
	
	MyException(int hours,int minutes) {
			hour=hours;
			min=minutes;
	}

	public String toString() {
		return "Error situation time must be correct: arg[" + hour + min+ "]";
	}
}
