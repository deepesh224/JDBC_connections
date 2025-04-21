package Collection;

import java.util.Stack;

public class ST {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.add(333);
		s.add(56);
		System.out.println(s);
		s.push(222);
		System.out.println(s);
		System.out.println(s.empty());

	}

}
