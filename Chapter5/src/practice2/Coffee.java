package practice2;

public class Coffee {

	public String name; //���ٹ�, ��ٹ�
	public int money = 0;
	public String customer;
	
	public Coffee(String name){
		this.name = name;
	}
	
	public void buy(int price, String customer) {
		this.money += price;
		this.customer = customer;
		
	}
	
	public void showInfo() {
		System.out.println(name + "�� �ֱ� ������ " + customer + "�̰�  ������  ��" + money + "�Դϴ�.");
	}
	
}