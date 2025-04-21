package Collection;

import java.util.HashSet;

public class set {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.add("ffff");
		h.add("dfvfdfv");
		h.add("kjbv");
		System.out.println(h);
		@SuppressWarnings("unchecked")
		HashSet<String> d=(HashSet<String>) h.clone();
		System.out.println(d);
		h.add("shvbjdsbjh");
		h.addAll(d);
		System.out.println(h);
		System.out.println(h.containsAll(d));

	}

}
