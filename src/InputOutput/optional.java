package InputOutput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

class user{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class optional {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Truefriend@123");
			Scanner sc = new Scanner(System.in);
			String sql = "Create database "+ sc.next();
			PreparedStatement psmt = conn.prepareStatement(sql);
			int i = psmt.executeUpdate();
			if(i>0) {
				System.out.println("Dtatbase Created");
			}
			else {
				System.out.println("error");
			}


			conn.close();
			sc.close();
			psmt.close();
		}
		catch(Exception ec) {
			ec.printStackTrace();

		}

	}

}
