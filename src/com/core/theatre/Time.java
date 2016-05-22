package com.core.theatre;


public class Time {
	private int hour;
	private int min;

	public Time(int hours, int minutes)  {
		try {
			setTime(hours, minutes);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Time() throws MyException {
		setTime(0, 0);
	}

	public void setTime(int hours, int minutes) throws MyException   {
		if (hours <= 0 || hours > 24){
			throw new MyException(hours, minutes);
		}
         	
		hour = hours;
		if (0 <= minutes && minutes < 60)
			min = minutes;
		else
			min = 0;
	}

	public void incrementHours() {
		hour++;
		if (hour > 23)
			hour = 0;
	}

	public void incrementMinutes() {
		min++;
		if (min > 59) {
			incrementHours();
			min = 0;
		}
			
	}

	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public void printTime() {
		if (hour < 10)	
			System.out.print("0");
		System.out.print(hour + ":");

		if (min < 10)
			System.out.print("0");
		System.out.print(min);

	}

	@Override
	public String toString() {
		String str = "";

		if (hour < 10)
			str = "0";
		str = str + hour + ":";

		if (min < 10)
			str = str + "0";
		str = str + min;

		return str;
	}

}
