package Day1;

import java.util.Scanner;

public class Got {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number 1 : ");
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter number 2:");
		int b=s.nextInt();
		if(a>b) {
			System.out.println(a+" is greater");
		}
		else {
			System.out.println(b+" is greater");
		}
		s.close();
	}

}
