package staticex;

public class Student {

	// �������, �Ӽ���..
	private static int serialNum = 1000; //static������ private����
	private int studentID;
	public String studentName;
	public String address;
	
	//public Student() {} // �⺻������
	public Student(String name) { //�̸��� �޴� ������
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	// Ŭ�����̸��� ���� �޼��� ����
	// ��ü ������ ��������� �ʱ�ȭ�� �� �ִ�.
	public Student(int id, String name) { //�̸��� ���̵� �޴� ������
		studentID = id;
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	//�޼���
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
}