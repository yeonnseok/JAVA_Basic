package classpart;

public class Student {

	// �������, �Ӽ���..
	private int studentID;
	public String studentName;
	public String address;
	
	public Student() {} // �⺻������
	public Student(String name) { //�̸��� �޴� ������
		studentName = name;
	}
	// Ŭ�����̸��� ���� �޼��� ����
	// ��ü ������ ��������� �ʱ�ȭ�� �� �ִ�.
	public Student(int id, String name) { //�̸��� ���̵� �޴� ������
		studentID = id;
		studentName = name;
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
	
}