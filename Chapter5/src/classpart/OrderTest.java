package classpart;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		
		order.orderNumber = "201907210001";
		order.customerID = "abc123";
		order.orderDate = "2019�� 7�� 21��";
		order.customerName = "ȫ���";
		order.productID = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ���ȣ: " + order.orderNumber);
		System.out.println("�ֹ��ھ��̵�: " + order.customerID);
		System.out.println("�ֹ���¥: " + order.orderDate);
		System.out.println("�ֹ����̸�: " + order.customerName);
		System.out.println("��ǰ��ȣ: " + order.productID);
		System.out.println("�����: " + order.address);
		
	}

}