package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Licolle {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		
		System.out.println(li);
		
		Collections.sort(li);
		
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		Collections.shuffle(li);
		System.out.println(li);
		System.out.println(Collections.min(li));
		System.out.println(Collections.max(li));
		int index = Collections.binarySearch(li, 2);
		System.out.println(index);
		Collections.swap(li, 0, li.size()-1);
		List<String> li2 = new ArrayList<>(Arrays.asList("this","is","gg","ert"));
		System.out.println(li2);
		Collections.fill(li2, "ok");
		System.out.println(li2);
		List<String> li3 = new ArrayList<>(Arrays.asList("ygfy","uefuh","ud","cdde"));
		Collections.copy(li2, li3);
		System.out.println(li3);
		System.out.println(li2);
		Collections.frequency(li2, 99);
		System.out.println(li2);
		
	}

}
