package com.core.theatre;

import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws MyException {

		Time time = new Time(11, 00);
		Movie m = new Movie("KIll all zombie", new Time(1, 30));
		Seance s = new Seance(time, m);
		System.out.println();
		System.out.println(s);
		Cinema cinema = new Cinema(Days.MONDAY);
		cinema.addMovie(m,time);
		System.out.println(cinema);
		System.out.println(m);
		
		MyScanner sc = MyScanner.getInstance();

	}

}