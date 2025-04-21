package InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pro4 {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("index.html"));

			bw.write("hbshvjkzf");
			bw.close();
			BufferedReader be = new BufferedReader(new FileReader("index.html"));
			String line= be.readLine();
			while(line!=null) {
				System.out.println(line);
				line = be.readLine();
				}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
