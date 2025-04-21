package Day1;

import java.util.Scanner;

public class Banking {
	static int Currentbalance = 1000;
	static Scanner sc = new Scanner(System.in);

	static void atm() {
		boolean  flag= true;
		do {
			System.out.println("\t1.Withdraw\n"+"\t2.Deposite\n"+"\t3.CurrentBalance\n"+"\t4.Exit\n"+"Enter your action :\n");
			int a = sc.nextInt();

			switch(a){
			case 1:
				System.out.println("Withdraw amount : ");
				int b = sc.nextInt();
				if(b<=Currentbalance) {
					Currentbalance -= b ;
					System.out.println("Withdraw successfully completed\n"+"Currentbalance :"+Currentbalance+"\n");
				}
				else {
					System.out.println("Insufficent balance");
				}	
				break;

			case 2:{
				System.out.println("Deposite amount : ");
				int g = sc.nextInt();
				Currentbalance += g;
				System.out.println(g+ " Successfully Deposited\n"+"Currentbalance :"+Currentbalance);

				break;
			}
			case 3:
				System.out.println(Currentbalance);
				break;

			case 4:{
				flag = false;
				break;
			}
			default:{
				System.err.println("Error");
			}
		}
	}
		while(flag);	
}

	public static void main(String[] args) {

		atm();
	}


}
