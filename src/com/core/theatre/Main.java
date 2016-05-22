package com.core.theatre;

public class Main {
	public static void main(String[] args) throws MyException {

		Time time = new Time(11, 00);
		Movie m = new Movie("KIll all zombie", new Time(2, 30));
//		Seance s = new Seance(time, m);
//		System.out.println(s.getEndTime());
		Cinema cinema = new Cinema(Days.MONDAY);
		cinema.addMovie(m,time);

		MyScanner sc = MyScanner.getInstance();
	}

}