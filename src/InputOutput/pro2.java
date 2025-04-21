package InputOutput;

import java.io.File;

public class pro2 {

	public static void main(String[] args) {
		File f = new File("index.html");
		try {
			if (f.createNewFile()) {
				System.out.println("file is Succesfully  created"+f.getName());
			}
			else {
				System.out.println("file is nogt created");
			}
			System.out.println("absolute path : "+f.getAbsolutePath());
			System.out.println("read"+f.canRead());
			System.out.println("write"+f.canWrite());
			System.out.println("length"+f.length());
			System.out.println("file or not "+f.isFile());
			System.out.println("for directory"+f.isDirectory());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
