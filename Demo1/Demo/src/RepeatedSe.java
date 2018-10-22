import java.util.Scanner;

public class RepeatedSe{
	public static void main(String args[])
	{
		System.out.println("---- Testing--- Application");
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		sc.close();
		RepeatedEx e=new RepeatedEx();
		e.fcrcheck(input);
		}
}

