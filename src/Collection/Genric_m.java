package Collection;

import java.util.Scanner;

class vehicle{
	public static<t> void ArrayList(t[] arr) {
		for (t car : arr) {
			System.out.print(car+" ");
		}
	}
	
}

public class Genric_m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arr);
		String[] i = {"iaud","hadv","iaudh"};
		vehicle.ArrayList(i);
 
	}

}
