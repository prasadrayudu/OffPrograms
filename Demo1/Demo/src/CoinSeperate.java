import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Coins {
	void getval() {

	}

	void display() {

	}

}

public class CoinSeperate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println("Enter the count");
		List<String> coins = new ArrayList<>();
		List<String> notes = new ArrayList<>();
		System.out.println("Enter value");
		for (int i = 0; i <= N; i++) {
			String enteredValue = "";
		
			enteredValue = sc.nextLine();
			if(enteredValue.contains("coin")){
				coins.add(enteredValue);
			}else if(enteredValue.contains("note")){
				notes.add(enteredValue);
			}
			
		}
		int sum=0;
		
		System.out.println("coins");
		for(String str : coins){
		sum=sum+Integer.parseInt(str.split(" ")[1]);
			System.out.println(str.split(" ")[1]);
		}
		System.out.println("Total coins : "+sum);
		int sum1=0;
		System.out.println("notes");
		for(String str : notes){
			sum1=sum1+Integer.parseInt(str.split(" ")[1]);
			System.out.println(str.split(" ")[1]);
		}
		System.out.println("Total Notes : "+sum1);
	/*	for (int i = 0; i <= N; i++) {
			// Line[i]=sc.nextLine();
			System.out.println(Line[i]);

		}*/
		Coins c = new Coins();
		c.getval();
		c.display();

	}
}

//
//
// String str1=sc.nextLine();
// String[] str2=str1.split(" ");
// for(int j=0;j<str2.length;j++)
// {
// System.out.println(str2[j]);
// }
// int j=0;