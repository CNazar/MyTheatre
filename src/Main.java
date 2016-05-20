
public class Main {
	public static void main(String[] args) {

		Time time = new Time(46, 88);
		Movie m = new Movie("KIll all zombie", new Time(2, 30));
		Seance s = new Seance(time, m);
		System.out.println(s.getEndTime());


	}

}
