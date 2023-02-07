package Day1;

import java.util.Scanner;
public class Eosum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number 1:");
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		System.out.println("Enter a number 2:");
		int y=s.nextInt();
		if((x+y)%2==0) {
			System.out.println(x+y+" is even");
		}
		else {
			System.out.println(x+y+" is Odd");
		}
		s.close();
	}

}
