package Day3;

class Student {
	private String Roll_no;
	private String Std_name;
	private String Std_email;
	private String Std_password;
	
	public void setRoll_nos(String no) {
		this.Roll_no = no;
	}
	
	public String getRoll_no() {
		return Roll_no;
	}

	public void setRoll_no(String roll_no) {
		Roll_no = roll_no;
	}

	public String getStd_name() {
		return Std_name;
	}

	public void setStd_name(String std_name) {
		Std_name = std_name;
	}

	public String getStd_email() {
		return Std_email;
	}

	public void setStd_email(String std_email) {
		Std_email = std_email;
	}

	public String getStd_password() {
		return Std_password;
	}

	public void setStd_password(String std_password) {
		Std_password = std_password;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String roll_no, String std_name, String std_email, String std_password) {
		super();
		Roll_no = roll_no;
		Std_name = std_name;
		Std_email = std_email;
		Std_password = std_password;
	}

}

public class Encapulation {

	public static void main(String[] args) {
		Student s = new Student();
		s.setRoll_no("101");
		System.out.println(s.getRoll_no());

	}

}
