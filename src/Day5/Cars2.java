package Day5;

abstract class vehiclee{
	String name;
	abstract void start();
	
}
class audi extends vehiclee{
	void start() {
		System.out.println("Audi is Running..................");
	}
	
}

public class Cars2 {

	public static void main(String[] args) {
		audi a = new audi();
		a.start();
	}

}
