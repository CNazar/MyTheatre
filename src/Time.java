
public class Time {
	private int hour;
	private int min;

//	 Time(){};
//	
//	 Time(int min, int hours){
//	 this.min=min;
//	 this.hours=hours;
//	 }
//	
//	 static public Time add(Time startTime , Time duration){
//	 return new Time(startTime.min + duration.min,startTime.hours +
//	 duration.hours);
//	 }

	public Time(int hours, int minutes) {
		setTime(hours, minutes);
	}

	public Time() {
		setTime(0, 0);
	}

	public void setTime(int hours, int minutes) {
		if (0 <= hours && hours < 24)
			hour = hours;
		else
			hour = 0;

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
			min = 0;
			incrementHours();
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
