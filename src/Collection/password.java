package Collection;

class comparig{
	public static<a> boolean compare(a a1,a a2) {
		return a1.equals(a2);
	}
}

public class password {

	public static void main(String[] args) {
		comparig c=new comparig();
		boolean b=c.compare(1, 1);
	   System.out.println(b);

	}

}
