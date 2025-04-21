package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
	String st_name;
	int st_id;
	
	public student(int st_id,String st_name) {
		this.st_name= st_name;
		this.st_id= st_id;
	}
}

public class pro5 {

	public static void main(String[] args) {
		student s = new student(222,"sai");
		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("admin.html"));
			o.writeObject(s);
			System.out.println("data is inserted");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream("admin.html"));
			student s1 = (student) oi.readObject();
			System.out.println("student id : "+s1.st_id);
			System.out.println("student name : "+s1.st_name);
			oi.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
