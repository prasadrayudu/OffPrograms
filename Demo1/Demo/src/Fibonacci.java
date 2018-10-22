import java.util.Scanner;

public class Fibonacci {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Boolean result=false;
		
		int a = 0;
		int b = 1;
		int c=0;
		//System.out.print(a);
		while(c<x) {
		 c = a + b;
			a = b;
			b = c;
		}
		if(c==x)
			{
			System.out.println("The given number is fibonnaci "+ x);
		}else
		{
			System.out.println("The number is not a fibonacci ");
		}
		
	}

}