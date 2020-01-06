package object;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if (this.studentNum == std.studentNum)
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
}


public class EqualsTest {

	public static void main(String[] args) {

		Student Lee = new Student(100, "�̼���");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "�̼���");
		
		System.out.println(Lee == Shin);     //���δٸ� �޸� �ּ��� ��ü
		System.out.println(Lee.equals(Shin));//���������� ���� ������ �������������.
		
		System.out.println(Lee.hashCode());               // �ؽ� �� Ȯ�� 100
		System.out.println(Shin.hashCode());              // �ؽ� �� Ȯ�� 100
		
		System.out.println(System.identityHashCode(Lee)); // ���� �ּҰ� 
		System.out.println(System.identityHashCode(Shin));// ���� �ּҰ�
		
	}

}