package thisex;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("�̸� ����", 1); // �ʱⰪ!
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("�̸� :" + name + " ���� : " + age);
	}
	
	public Person getSelf() { //�ڱ� Ŭ���� �̸��� ��ȯ������ ����
		return this;
	}
	
}