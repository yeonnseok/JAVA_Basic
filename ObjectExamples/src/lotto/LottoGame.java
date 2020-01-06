package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
	
	/*
	 * �ζ� ���� �����
	 */
	private static final int LOTTO_SIZE = 6;
	private static final int LOTTO_MIN = 1;
	private static final int LOTTO_MAX = 46;
	
	/* �ζ� ��÷ ��ȣ - ���ʽ� ��ȣ�� ����ó�� ���� �ӽø���Ʈ */
	private List<Integer> winningNumbers;
	private int bonusNumber;
	
	private Player player;
	private WinningCalculator winningCalculator;
	
	/* ���� ���� ���� �޼��� */
	public void play() {
		player = new Player();
		player.purchaseLotto();
		inputWinningNumbers();
		inputBonusNumber();
		winningCalculator = new WinningCalculator(winningNumbers, bonusNumber);
		winningCalculator.calculatePlayerScore(player);
	}
	
	/*
	 * �ζ� ��÷ ��ȣ �Է� 
	 */
	private void inputWinningNumbers() {
		Scanner input = new Scanner(System.in);
		winningNumbers = new ArrayList<>();
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
			inputWinningNumbers();
		}
	}
	
	/*
	 * ���ʽ� ��÷ ��ȣ �Է�
	 */
	private void inputBonusNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("���ʽ� ��ȣ�� �Է��� �ּ���");
		try {
			int inputNumber = input.nextInt();
			checkLottoRange(inputNumber);
			chekcDuplicated(winningNumbers, inputNumber);
			bonusNumber = inputNumber;
		} catch(Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");
			inputBonusNumber();
		}
	}
	
	/*
	 * �ζ� ��ȣ�� 1~46 ���� ���� �ȿ� �������� Ȯ��
	 */
	private void checkLottoRange(int number) throws Exception {
		if (number < LOTTO_MIN | number > LOTTO_MAX) {
			throw new Exception();
		}
	}
	
	/*
	 * �ߺ��Ǵ� ���� �Է��ߴ��� Ȯ��
	 */
	private void chekcDuplicated(List<Integer> winningNumbers, int number) throws Exception {
		if (winningNumbers.contains(number)) {
			throw new Exception();
		}
	}
}