package Day1;

import java.util.Scanner;
public class Eod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number :");
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		if(x%2==0) {
			System.out.println(x+" is Even");
		}
		else {
			System.out.println(x+" is Odd");
		}
		s.close();
	}
}
