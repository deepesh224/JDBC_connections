package Collection;

class product<t>{
	private t brand;
	public void pack(t brand) {
		this.brand = brand;
	}
	public t unpack() {
		return brand;
	}
}

class bag extends product{
	public String toString(){
		return "fvfev";
	}
}

class perfume extends product{
	public String toString() {
		return "frfrf";
	}
}

public class emplo_22 {
	public static void main(String[] args) {
		product<bag> p = new product();
		p.pack(new bag());
		System.out.println(p.unpack());
	}
}
