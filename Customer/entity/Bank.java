package by.htp.less14.customer.entity;

import java.util.ArrayList;

public class Bank {

	private String bankName;

	private ArrayList<Customer> customerList = new ArrayList<>();

	public Bank(String bankName) {
		this.bankName = bankName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}

	public void addCustomerToBankList(Customer customer) {
		customerList.add(customer);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((customerList == null) ? 0 : customerList.hashCode());
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
		Bank other = (Bank) obj;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (customerList == null) {
			if (other.customerList != null)
				return false;
		} else if (!customerList.equals(other.customerList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", customerList=" + customerList + "]";
	}

}
