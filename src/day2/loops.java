package day2;

import java.util.Scanner;

public class loops {
	private static void Displaymenu() {
		System.out.println("enter your choice : "+"\n \t1.Additional"+"\n \t2.Subtraction");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a;
		do {
			Displaymenu();
			a = Integer.parseInt(sc.next());
		}
		while(a>0);
		
		
		sc.close();
	}

}
