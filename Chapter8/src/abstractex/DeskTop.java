package abstractex;

public class DeskTop extends Computer {

	//둘다 구현해야 일반 클래스가 될 수 있다.
	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override
	public void turnOff() {
		System.out.println("desktop turnoff");
	}
	
}
