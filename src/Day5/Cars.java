package Day5;

interface vehicle{
	void start();
	
}

class mg implements vehicle{
	public void start() {
		System.out.println("Car is Starting...............");
	}
}

public class Cars {

	public static void main(String[] args) {
		mg g = new mg();
		g.start();

	}

}
