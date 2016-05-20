import java.util.TreeMap;

public class Cinema {

	private TreeMap<Days, Scedule> map;
	private Time open;
	private Time close;
	private Days day;
	private Time freeTime;

	public Cinema(Days day) {
		switch (day) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			this.day=day;
			open =new Time(11, 00);
			map = new TreeMap<Days, Scedule> ();
			map.put(day, new Scedule());
			break;

		case SATURDAY:
		case SUNDAY:
			open =new Time(9, 00);
			break;

		default:
			System.out.println("What day is it?");
			
		}
	}
	public void calculateFT(Movie movie){
		if (freeTime != null) {
			//freeTime = 
		}
		else freeTime = new Time(open.getHour(),open.getMin());
	}

	public void addMovie(Movie movie){
		this.map.get(day).addSeance(new Seance(freeTime, movie));
	}
	 
	public TreeMap<Days, Scedule> getMap() {
		return map;
	}

	public void setMap(TreeMap<Days, Scedule> map) {
		this.map = map;
	}

	public Time getOpen() {
		return open;
	}

	public void setOpen(Time open) {
		this.open = open;
	}

	public Time getClose() {
		return close;
	}

	public void setClose(Time close) {
		this.close = close;
	}

}
