package by.htp.less14.train.start;

import java.util.Calendar;

import by.htp.less14.train.entity.Depo;
import by.htp.less14.train.entity.Train;
import by.htp.less14.train.logic.TrainLogic;
import by.htp.less14.train.presentation.TrainView;

public class TrainMain {

	public static void main(String[] args) {

		TrainView view = new TrainView();
		Depo depo = new Depo();
		TrainLogic logic = new TrainLogic();

		Calendar calendar1 = Depo.dateTime(21, 12, 05, 5, 2030);
		Calendar calendar2 = Depo.dateTime(10, 9, 06, 8, 2000);
		Calendar calendar3 = Depo.dateTime(23, 15, 07, 9, 2040);
		Calendar calendar4 = Depo.dateTime(14, 10, 11, 4, 2015);
		Calendar calendar5 = Depo.dateTime(11, 13, 12, 6, 2020);

		Train train1 = new Train(3, "Minsk", calendar1);
		Train train2 = new Train(2, "Vitebsk", calendar2);
		Train train3 = new Train(1, "Minsk", calendar3);
		Train train4 = new Train(4, "Mogilev", calendar4);
		Train train5 = new Train(5, "Gomel", calendar5);

		depo.addTrain(train1);
		depo.addTrain(train2);
		depo.addTrain(train3);
		depo.addTrain(train4);
		depo.addTrain(train5);

		view.printDepoTrains(depo.getTrains());
		logic.sortByNumberAsc(depo.getTrains());
		System.out.println("-----------sortByNumberAsc---------------");
		view.printDepoTrains(depo.getTrains());

		logic.sortByNumberDesc(depo.getTrains());
		System.out.println("------------sortByNumberDesc--------------");
		view.printDepoTrains(depo.getTrains());

		System.out.println("-----------getTrainInfo---------------");
		view.getTrainInfo(3, depo);

		System.out.println("----------sortByDestiniation----------------");
		logic.sortByDestiniation(depo.getTrains());
		view.printDepoTrains(depo.getTrains());

		System.out.println("----------sortByDestiniationAndTime----------------");

		logic.sortByDestiniationAndTime(depo.getTrains());
		view.printDepoTrains(depo.getTrains());

	}
}
