package by.htp.less14.customer.start;

import java.util.ArrayList;

import by.htp.less14.customer.entity.Bank;
import by.htp.less14.customer.entity.Customer;
import by.htp.less14.customer.logic.CustomerLogic;
import by.htp.less14.customer.presentation.CustomerView;

public class CustomerMain {

	public static void main(String[] args) {

		Bank bestBank = new Bank("Богатенький Буратино");

		bestBank.addCustomerToBankList(new Customer("Фролов", "Игорь", "Петрович", "Шафарнянская 22", 105, 6745323));
		bestBank.addCustomerToBankList(new Customer("Суриков", "Олег", "Олегович", "Рокоссовского 1", 180, 1234556));
		bestBank.addCustomerToBankList(new Customer("Шибут", "Георгий", "Алексеевич", "Восточная 17", 206, 5678905));
		bestBank.addCustomerToBankList(new Customer("Пшенко", "Виктор", "Евгеньевич", "Руссиянова 5", 350, 3457889));

		CustomerView view = new CustomerView();
		view.printList(bestBank.getCustomerList());

		System.out.println("----------------------------------");

		CustomerLogic logic = new CustomerLogic();
		ArrayList<Customer> customers = logic.getCustomersSortedBySurname(bestBank.getCustomerList());

		view.printList(customers);

		System.out.println("----------------------------------");

		ArrayList<Customer> customers1 = logic.getCustomersByCreditCardNumberRange(bestBank.getCustomerList(), 150, 300);

		view.printList(customers1);

	}
}
