package paractice1;

public class SuperLevel extends PlayerLevel{

	
	@Override
	public void run() {
		System.out.println("��û ������ �޸��ϴ�.");
	}
	
	@Override
	public void jump() {
		System.out.println("�ſ� ���� jump �Ҽ� �ִ�.");
	}
	
	@Override
	public void turn() {
		System.out.println("turn �Ҽ� �ֵ�.");
	}
	
	@Override
	public void showPlayerLevel() {
		System.out.println("****** ����� �����Դϴ�. ******");
	}
	
	
}