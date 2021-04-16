package by.htp.less14.train.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.less14.train.entity.Train;

public class TrainLogic {

	public ArrayList<Train> sortByNumberAsc(ArrayList<Train> trains) {

		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;

			for (int i = 1; i < trains.size(); i++) {
				if (trains.get(i).getTrainNumber() < trains.get(i - 1).getTrainNumber()) {
					swap(trains, i, i - 1);
					needIteration = true;

				}
			}
		}
		return trains;
	}

	public ArrayList<Train> sortByNumberDesc(ArrayList<Train> trains) {

		boolean needIteration = true;

		while (needIteration) {
			needIteration = false;
			for (int i = 1; i < trains.size(); i++) {
				if (trains.get(i).getTrainNumber() > trains.get(i - 1).getTrainNumber()) {
					swap(trains, i, i - 1);
					needIteration = true;
				}
			}
		}
		return trains;
	}

	private void swap(ArrayList<Train> trains, int i, int j) {
		Train tmp = new Train(trains.get(i).getTrainNumber(), trains.get(i).getDestiniation(),
				trains.get(i).getDepartureTime());
		trains.get(i).setTrain(trains.get(j).getTrainNumber(), trains.get(j).getDestiniation(),
				trains.get(j).getDepartureTime());
		trains.get(j).setTrain(tmp.getTrainNumber(), tmp.getDestiniation(), tmp.getDepartureTime());
	}

	public ArrayList<Train> sortByDestiniation(ArrayList<Train> trains) {

		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;
			for (int i = 1; i < trains.size(); i++) {
				int num = trains.get(i).getDestiniation().compareTo(trains.get(i - 1).getDestiniation());
				if (num < 0) {
					swap(trains, i, i - 1);
					needIteration = true;
				}
			}
		}
		return trains;
	}

	public ArrayList<Train> sortByDepartureTime(ArrayList<Train> trains) {

		boolean needIteratoin = true;
		while (needIteratoin) {
			needIteratoin = false;
			for (int i = 1; i < trains.size(); i++) {
				int num = trains.get(i).getDepartureTime().compareTo(trains.get(i - 1).getDepartureTime());
				if (num < 0) {
					swap(trains, i, i - 1);
					needIteratoin = true;
				}
			}
		}
		return trains;
	}

	private ArrayList<Train> sortByDepartureTime(ArrayList<Train> trains, int boundary1, int boundary2) {

		boolean needIteratoin = true;
		while (needIteratoin) {
			needIteratoin = false;

			for (int i = boundary1; i < boundary2; i++) {
				int num = trains.get(i).getDepartureTime().compareTo(trains.get(i + 1).getDepartureTime());
				if (num > 0) {
					swap(trains, i, i + 1);
					needIteratoin = true;
				}
			}
		}
		return trains;
	}

	public ArrayList<Train> sortByDestiniationAndTime(ArrayList<Train> trains) {

		ArrayList<Train> sortedListByDestiniation = sortByDestiniation(trains);
		List<Integer> boundaries = new ArrayList<Integer>();
		int cityCounter = 1;

		for (int i = 0; i < sortedListByDestiniation.size() - 1; i++) {
			if (sortedListByDestiniation.get(i).getDestiniation()
					.equals(sortedListByDestiniation.get(i + 1).getDestiniation())) {
				cityCounter++;
				if (cityCounter == 2) {
					boundaries.add(i);
				}
			} else {

				if (cityCounter > 1) {
					boundaries.add(i);
				}
				cityCounter = 1;
			}
		}

		for (int i = 0; i < boundaries.size();) {

			sortByDepartureTime(trains, boundaries.get(i), boundaries.get(i + 1));
			i += 2;
		}

		return trains;
	}
}
