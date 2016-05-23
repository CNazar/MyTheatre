package com.core.theatre;



public class Seance implements Comparable<Seance> {
	Movie movie;
	Time startTime;
	Time endTime;
	
	public Seance (Time startTime, Movie movie){
        this.startTime = startTime;
        this.movie = movie;
        this.endTime = helper(movie.getDuration());
    }

	
	public Time helper (Time duration) {
		int endMin = this.startTime.getMin() + duration.getMin();
		int hour = 0;
		if (endMin > 59){
			hour = endMin/60;
			endMin = endMin%60;
		}
		int endHours = this.startTime.getHour() + duration.getHour() + hour;
		return new Time(endHours,endMin);
	}


	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}


	public Time getStartTime() {
		return startTime;
	}


	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}


	public Time getEndTime() {
		return endTime;
	}


	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}


	@Override
	public int compareTo(Seance o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		return "Seance:"+  movie + " startTime=" + startTime + ", endTime=" + endTime ;
	}
	
	
}
