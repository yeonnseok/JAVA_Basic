package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		GoldCustomer customerGo = new GoldCustomer(10030, "���浿");
		customerGo.bonusPoint = 7000;
		System.out.println(customerGo.showCustomerInfo());
		
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerGo);
		for(Customer customer: customerList) {
			System.out.println(customer.getCustomerName() + "������ ���Ű����� " + customer.calcPrice(10000) + "�� �Դϴ�.");			
		}
		
	}

}