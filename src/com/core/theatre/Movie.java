package com.core.theatre;


public class Movie {
	private String title;
	private Time duration;

	public Movie(String title, Time duration) {
		this.title = title;
		this.duration = duration;

	}

	public Time getDuration() {
		return duration;
	}

	public void setDuration(Time duration) {
		this.duration = duration;
	}

	public Movie(String title) {
		this.title = title;

	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Movie: ");		
		sb.append("'").append(title).append('\'');
		sb.append(", duration: ").append(duration);
		return sb.toString();
		
	}
}