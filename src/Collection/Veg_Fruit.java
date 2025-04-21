package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veg_Fruit {
	static boolean flag = true;

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		ArrayList<String> ar = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("enter veg_item u want : ");
			li.add(sc.next());
			System.out.println(li);
			
			System.out.println("Do u want add veg_items(yes or no) :");
			if (sc.next().equals("yes")) {
				flag = true;
			}
			else {
				flag = false;
			}
		}
		while(flag);
	
		
		
		

	}

}
