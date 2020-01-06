package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
	
	/* �ζ� ���� ����� */
	private static final int LOTTO_PRICE = 1000;
	private static final int LOTTO_SIZE = 6;
	private static final int LOTTO_MIN = 1;
	private static final int LOTTO_MAX = 46;
	
	/* �ζ� ���� �ݾ� (1000�� ����)*/
	private long amount;
	
	/* ������ �ζ� ��Ʈ�� */
	private List<Lotto> lottoSet = new ArrayList<>();
	
	/*
	 * �ζ� ���� ����
	 */
	public void purchaseLotto() {
		inputPurchaseAmount();
		makeLottoSet();
		showLottoSet();
	}
	
	/*
	 * �ζ� ���� �ݾ� �Է�
	 */
	private void inputPurchaseAmount() {
		Scanner input = new Scanner(System.in);
		System.out.println("���� �ݾ��� �Է��� �ּ���");
		
		try {
			amount = (long)(input.nextLong())/LOTTO_PRICE * LOTTO_PRICE;
			checkPurchaseAmount(amount);
		} catch(Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");
			inputPurchaseAmount();
		}
	}
	
	/*
	 * ���� �ݾ� 1000�� �̸��� ����ó��
	 */
	private void checkPurchaseAmount(long amount) throws Exception {
		if (amount < 1000) {
			throw new Exception();
		}
	}
	
	/*
	 * ���� �ݾ׸�ŭ �ζ� ��Ʈ ����
	 */
	private void makeLottoSet() {
		System.out.println("���ϴ� �ζ� ��ȣ�� �Է����ּ���.");
		for (int i = 0; i < (int)amount/LOTTO_PRICE; i++) {
			lottoSet.add(pickLottoNumbers());
		}
	}
	
	/*
	 * �ζ� ��ȣ �Է�
	 */
	private Lotto pickLottoNumbers() {
		Scanner input = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		try {
			for (int i = 0; i < LOTTO_SIZE; i++) {
				int inputNumber = input.nextInt();
				checkLottoRange(inputNumber);
				chekcDuplicated(numbers, inputNumber);
				numbers.add(inputNumber);
			}
		} catch(Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return pickLottoNumbers();
		}
		return new Lotto(numbers);
	}
	
	/*
	 * �ζ� ��ȣ �Է� ����ó��
	 */
	private void checkLottoRange(int number) throws Exception {
		if (number < LOTTO_MIN | number > LOTTO_MAX) {
			throw new Exception();
		}
	}
	
	/*
	 * �ζ� ��ȣ �Է� ����ó��
	 */
	private void chekcDuplicated(List<Integer> numbers, int number) throws Exception {
		if (numbers.contains(number)) {
			throw new Exception();
		}
	}
	
	/*
	 * �ζ� ��Ʈ�� ���
	 */
	private void showLottoSet() {
		System.out.println((int)amount/LOTTO_PRICE + "���� �����߽��ϴ�.");
		for (Lotto lotto : lottoSet) {
			lotto.showLottoNumber();
		}
	}
	
	public List<Lotto> getLottoSet(){
		return lottoSet;
	}
	
	public long getAmount() {
		return amount;
	}
	
}