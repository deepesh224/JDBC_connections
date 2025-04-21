package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class pro1 {

	public static void main(String[] args) {
		String source_path = "C://Users//kotad//OneDrive//Pictures//Screenshots//ggg.png";
		String destination_path = "C://Users//kotad//OneDrive//Pictures//Screenshots//jjj.png";
		
		try (
			FileInputStream fi = new FileInputStream(source_path);
			FileOutputStream ou  = new FileOutputStream(destination_path);
			)
		{
			byte[] buffer = new byte[1024];
			int byteread;
			while((byteread= fi.read(buffer))!= -1) {
				ou.write(buffer,0,byteread);
			}
			System.out.println("Succesfully Created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
