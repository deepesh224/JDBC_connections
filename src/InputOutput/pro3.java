package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pro3 {

	public static void main(String[] args) {
		String feedback = "Issue Resolved";
		
		
		try(
				FileWriter fw = new FileWriter("data.txt");
				) {
			fw.write(feedback);
			System.out.println("Data Inserted");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(
				FileReader fe = new FileReader("data.txt")
				) {
			StringBuilder sb = new StringBuilder();
			
			int chars;
			while((chars=fe.read())!=-1) {
				sb.append((char)chars);
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
