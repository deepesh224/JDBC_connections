package Collection;

import java.util.HashMap;
import java.util.Map;

public class Mp {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(222, "giet");
		m.put(12, "add");
		System.out.println(m);
		System.out.println(m.get(12));
		System.out.println(m.containsKey(12));
		System.out.println(m.containsValue("giet"));
		System.out.println(m.isEmpty());
		System.out.println(m.remove(12));
		System.out.println(m.size());
	}

}
