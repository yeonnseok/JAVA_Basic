package paractice1;

public class SuperLevel extends PlayerLevel{

	
	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
	}
	
	@Override
	public void jump() {
		System.out.println("매우 높이 jump 할수 있다.");
	}
	
	@Override
	public void turn() {
		System.out.println("turn 할수 있따.");
	}
	
	@Override
	public void showPlayerLevel() {
		System.out.println("****** 상급자 레벨입니다. ******");
	}
	
	
}
