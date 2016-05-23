package com.core.theatre;
import java.util.Set;
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
			close=new Time(21,00);
			map = new TreeMap<Days, Scedule> ();
			map.put(day, new Scedule());
			break;

		case SATURDAY:
		case SUNDAY:
			open =new Time(9, 00);
			close = new Time(23,00);
			break;

		default:
			System.out.println("");
			
		}
	}
//	public void calculateFT(Movie movie){
//		if (freeTime != null) {
//			//freeTime = 
//		}
//		else freeTime = new Time(open.getHour(),open.getMin());
//	}

	public void addMovie(Movie movie, Time time){
		this.map.get(day).getSeances().add(new Seance(time, movie));
	}
	
	 
	public void removeMovie(Movie movie){
		Scedule scedule = this.map.get(day);
		Set<Seance> seances =  scedule.getSeances();
		for (Seance s : seances){
			if (s.getMovie().equals(movie))
				seances.remove(s);
		}
	}
	
	public void addSeance(Seance seance){
		if (this.map.get(day).getSeances() != null)
			this.map.get(day).getSeances().add(seance);
	}
	
	public void removeSeance(Seance seance, String day){
		Scedule scedule = this.map.get(day.toString());
		Set<Seance> seances =  scedule.getSeances();
		for (Seance s : seances){
			if (s.equals(seance))
				seances.remove(s);
		}
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

	@Override
	public String toString() {		
		final StringBuilder sb = new StringBuilder("Scedule: ");		
		sb.append(day);
		sb.append(" open-").append(open);
		sb.append(" close-").append(close);	
		return sb.toString();
	}

}
