package Collection;

import java.util.TreeSet;

public class TS {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(2);
		ts.add(33);
		ts.add(44);
		System.out.println(ts);
//		ts.pollFirst();
        System.out.println(ts.higher(2));
        System.out.println(ts.headSet(66));
        System.out.println(ts.tailSet(4));
        System.out.println(ts.subSet(20, 70));
        System.out.println(ts.ceiling(12));
        System.out.println(ts.floor(5));
        System.out.println(ts.descendingSet());
        System.out.println(ts.last());
        
	
	}

}
