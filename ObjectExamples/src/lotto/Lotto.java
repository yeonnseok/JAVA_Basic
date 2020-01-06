package lotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * �ζ� ������ �ǹ��ϴ� ��ü
 */
public class Lotto {
	private final List<Integer> numbers;
	
	public Lotto(List<Integer> numbers) {
		this.numbers = numbers; 
	}
	
	/*
	 * �ζ� ��ȣ ���
	 */
	public void showLottoNumber() {
		Collections.sort(numbers);
		System.out.println(Arrays.toString(numbers.toArray()));	
	}
	
	/*
	 * �ζ� ��ȣ ������
	 */
	public List<Integer> getNumbers(){
		return numbers;
	}
}