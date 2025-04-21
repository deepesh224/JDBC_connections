package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class LIT {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		ArrayList<String> li1 = new ArrayList<>();
		li.add(22);
		li.add(25);
		li.add(65);
		li.add(44);
		li.add(223);
		li.add(322);
		li1.add("vgsfgsg");
		li1.add("bunny");
		li1.add("rahul");
		li1.add("ggg");
		li1.add("trdd");
		System.out.println(li);
		Iterator<Integer> i = li.iterator();
		while(i.hasNext()) {
			Integer i1 = i.next();
			System.out.println(i1);
			if (i1==46) {
				System.out.println("Removing data 46");
				li.remove(46);
				
			}
		}
		System.out.println(li);
		Iterator<String> j = li1.iterator();
		while(j.hasNext()) {
		String s= j.next();
		if (s.equals("bunny")) {
			System.out.println("removing data bunny");
			j.remove();;
		}
				
	}System.out.println(li1);

}
}
