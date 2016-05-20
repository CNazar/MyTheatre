
public class Movie {
	private String title;
	private int duration;

	public Movie(String title, int duration) {
		this.title = title;
		this.duration = duration;

	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
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
		return "Movie [title=" + title + ", duration=" + duration + "]";
	}
}