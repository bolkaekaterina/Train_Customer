package by.htp.less14.train.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Depo {
	private ArrayList<Train> trains;

	public Depo() {
		this.trains = new ArrayList<Train>();
	}

	public void addTrain(Train train) {
		trains.add(train);
	}

	public static Calendar dateTime(int hour, int minute, int month, int day, int year) {

		Calendar calendar = new GregorianCalendar(year, month, day);

		calendar.set(Calendar.HOUR, hour);
		calendar.set(Calendar.MINUTE, minute);

		calendar.roll(Calendar.MONTH, +1);
		

		return calendar;
	}

	public Depo(ArrayList<Train> trains) {
		this.trains = trains;
	}

	public ArrayList<Train> getTrains() {
		return trains;
	}

	public void setTrains(ArrayList<Train> trains) {
		this.trains = trains;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depo other = (Depo) obj;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Depo [trains=" + trains + "]";
	}
}
