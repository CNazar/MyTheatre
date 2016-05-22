package com.core.theatre;
import java.util.Scanner;


public class MyScanner {
	private static MyScanner instance;
	private Scanner sc;

	public MyScanner() {
		super();
		sc = new Scanner(System.in);
	}

	public static MyScanner getInstance() {
		if (instance == null) {
			instance = new MyScanner();
		}
		return instance;
	}

	public Scanner reset() {
		return sc.reset();
	}

	public void close() {
		sc.close();
	}

	public String next() {
		return sc.next();
	}

}
