package by.htp.less14.train.presentation;

import java.util.ArrayList;

import by.htp.less14.train.entity.Depo;
import by.htp.less14.train.entity.Train;

public class TrainView {
	
	public void printDepoTrains(ArrayList<Train> trains) {
		for(int i = 0; i < trains.size(); i++) {
			System.out.println(trains.get(i).toString());
		}
	}
	
	public void getTrainInfo(int trainNumber, Depo depo) {
		ArrayList<Train> trainsList = depo.getTrains();
		int trainsCount = trainsList.size();
		for(int i = 0; i < trainsCount; i++) {
			if(trainsList.get(i).getTrainNumber() == trainNumber) {
				System.out.println(trainsList.get(i).getDestiniation() + "  " + trainsList.get(i).getDepartureTime().getTime() + "  " +  trainsList.get(i).getTrainNumber());
			}
		}
	}
}
