package practice;

public interface Sort {

	void ascending();
	void descending();
	
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰����� �Դϴ�.");
	}
	
	public void showInfo();
	
}