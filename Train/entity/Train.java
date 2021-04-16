package by.htp.less14.train.entity;

import java.util.Calendar;

public class Train {

	private String destiniation;
	private int trainNumber;
	private Calendar departureTime;

	public Train() {
	}

	public Train(int trainNumber, String destiniation, Calendar departureTime) {
		this.destiniation = destiniation;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public void setTrain(int trainNumber, String destiniation, Calendar departureTime) {
		setTrainNumber(trainNumber);
		setDestiniation(destiniation);
		setDepartureTime(departureTime);
	}
	
	public String getDestiniation() {
		return destiniation;
	}

	public void setDestiniation(String destiniation) {
		this.destiniation = destiniation;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Calendar getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Calendar departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destiniation == null) ? 0 : destiniation.hashCode());
		result = prime * result + trainNumber;
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
		Train other = (Train) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destiniation == null) {
			if (other.destiniation != null)
				return false;
		} else if (!destiniation.equals(other.destiniation))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [destiniation=" + destiniation + ", trainNumber=" + trainNumber + ", departureTime="
				+ departureTime.getTime() + "]";
	}
	
	
	
	
}

	