package Day3;

class Dog {
	String Colour;
	String bried;
	int age;
	int Height;
	boolean gender;

	void eating() {
		System.out.println("Dog is eating");
	}

	void drinking() {
		System.out.println("Dog is eating");
	}

	void behaviour() {
		System.out.println("Dog is eating");
	}

	void sleeping() {
		System.out.println("Dog is eating");
	}

	void barking() {
		System.out.println("Dog is eating");
	}
}

public class oops {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.Colour = "white";
		d.age = 3;
		d.bried = "Golden Retriver";
		d.Height = 5;
		d.gender = true;
		
		System.out.println(d.age);
		System.out.println(d.Height);
		System.out.println(d.gender);
		System.out.println(d.Colour);
		System.out.println(d.bried);
		
		d.sleeping();
		d.barking();
		
	}

}
