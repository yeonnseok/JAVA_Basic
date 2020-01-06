package collection;

import java.util.ArrayList;

class MyStack {

	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("������ ������ϴ�.");
		}
		return arrayStack.remove(len-1); // remove������ ������ �ε����� �ִ´�.
	}
}


public class StackTest{
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop()); //'C'
		System.out.println(stack.pop()); //'B'
		System.out.println(stack.pop()); //'A'
		System.out.println(stack.pop()); //"������ ������ϴ�."
	}
}