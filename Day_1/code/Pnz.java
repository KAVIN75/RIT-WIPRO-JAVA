package Day1;
import java.util.*;
public class Pnz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x=s.nextInt();
		if(x==0)
		{
			System.out.print("zero");
		}
		else if(x>0)
		{
			System.out.print("positive");
		}
		else
		{
			System.out.print("negative");
		}
		s.close();
	}

}
