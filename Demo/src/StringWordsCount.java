import java.util.Scanner;

public class StringWordsCount {

	static void wordCount(String input,String wordToCount)
	{
		System.out.println("---------------");
		System.out.println(" Given word : " +input);
		System.out.println(" Given word to Count : " +wordToCount);
		int count=0;
		String[] words=input.split(" ");
		for (int i=0;i<words.length;i++)
		{
		    if(wordToCount.equals(words[i]))
		    {
		    	count++;
		   //  System.out.println(count);   
		    }
		  
		}
		
		System.out.println(count);
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	String wordToCount=sc.nextLine();
	sc.close();
	wordCount(input,wordToCount);

	

	}

}
