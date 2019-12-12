package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
	private static final int LOTTO_SIZE = 6;
	private static final int LOTTO_MIN = 1;
	private static final int LOTTO_MAX = 46;
	
	private List<Integer> winningNumbers;
	
	private Player player;
	private WinningCalculator winningCalculator;
	
	public void play() {
		player = new Player();
		player.purchaseLotto();
		
		winningNumbers = inputWinningNumbers();
		winningCalculator = new WinningCalculator(winningNumbers, inputBonusNumber());
		winningCalculator.calculateScore(player);
	}
	
	private List<Integer> inputWinningNumbers() {
		Scanner input = new Scanner(System.in);
		List<Integer> winningNumbers = new ArrayList<>();
		System.out.println("��÷ ��ȣ�� �Է����ּ���");
		try {
			for (int i = 0; i < LOTTO_SIZE; i++) {
				int inputNumber = input.nextInt();
				checkLottoRange(inputNumber);
				chekcDuplicated(winningNumbers, inputNumber);
				winningNumbers.add(inputNumber);
			}
		} catch(Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return inputWinningNumbers();
		}
		return winningNumbers;
	}
	
	private int inputBonusNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("���ʽ� ��ȣ�� �Է��� �ּ���");
		int bonusNumber = 0;
		try {
			int inputNumber = input.nextInt();
			checkLottoRange(inputNumber);
			chekcDuplicated(winningNumbers, inputNumber);
			bonusNumber = inputNumber;
		} catch(Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return inputBonusNumber();
		}
		return bonusNumber;
	}
	
	private void checkLottoRange(int number) throws Exception {
		if (number < LOTTO_MIN | number > LOTTO_MAX) {
			throw new Exception();
		}
	}
	
	private void chekcDuplicated(List<Integer> winningNumbers, int number) throws Exception {
		if (winningNumbers.contains(number)) {
			throw new Exception();
		}
	}
}