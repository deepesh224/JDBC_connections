package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class students{
	private  String name;
	private int num;
	private long adhar;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public long getAdhar() {
		return adhar;
	}
	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}
	public students(String name, int num, long adhar) {
		super();
		this.name = name;
		this.num = num;
		this.adhar = adhar;
	}
	public students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "num: " +name+" num: "+ num+"adhar : "+adhar;
	}
	
}

public class employee2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<students> ar = new ArrayList<>();
		students st = new students();
		System.out.println("enter the name");
		st.setName(sc.next());
		ar.add(st);
		System.out.println(ar);
		Iterator<students> it = ar.iterator();
		while(it.hasNext()) {
			students i = it.next();
			System.out.println(i);
		}
		
	}

	

}
