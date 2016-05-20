
public class Seance {
	Movie movie;
	Time startTime;
	Time endTime;
	Time duration;
	
	public Seance (Time startTime, Time endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

	public Seance(Time duration){
		this.duration=duration;
	}
}
