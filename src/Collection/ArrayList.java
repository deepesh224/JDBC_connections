package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList {

	public static void main(String[] args) {
		List<Integer> li = new java.util.ArrayList<Integer>();
		java.util.ArrayList<Integer> al = new java.util.ArrayList<Integer>();
		li.add(54);
		li.add(23);
		li.add(22);
		System.out.println(li);
		
//		for(int i=0;i<li.size();i++) {
//			System.out.println(li.get(i));
//		}
		
		
//		li.forEach(e -> {
//			System.out.println(e);
//		});
		
		
//		Iterator<Integer> it = li.iterator();
//				while(it.hasNext()) {
//					System.out.println(it.next());
//				}
		
		
	
//		ListIterator<Integer> lt = li.listIterator(li.size());
//		while(lt.hasPrevious()) {
//			System.out.println(lt.previous());
		
		li.add(0, 3444);
		System.out.println(li);
		li.remove(2);
		System.out.println(li);
		
		al.add(67);
		al.add(7);
		li.addAll(al);
		System.out.println(li);
		
		li.retainAll(al);
		System.out.println(li);
		
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println(li.isEmpty());
		System.out.println(li.size());
		
		li.set(0, 33);
		System.out.println(li);
		
		System.out.println(li.indexOf(33));
		
		System.out.println(li.contains(33));
		
		li.clear();
		System.out.println(li);
		}
	}


