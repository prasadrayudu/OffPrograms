import java.util.HashMap;

public class RepeatedEx
{
	public void fcrcheck(String input)
	{
//	System.out.println(input);
//	Creating Hashmap to get the count of each character by iterating it
		HashMap<Character,Integer> CountMap=new HashMap<>();
		char[] strArray=input.toCharArray();
		for(char c:strArray)
		{
			if(CountMap.containsKey(c))
			{ 
				CountMap.put(c,CountMap.get(c)+1);
				
			}else
			{
				CountMap.put(c,1);
			}
		}System.out.println();
		
		System.out.println("Successful");
		System.out.println();
		
	//for checking the first non repeated char
		for(char c:strArray)
		{
		if(CountMap.get(c)==1)
		
		{
			System.out.println("First no n repeated character "+ ": " + input+" "+c);
			break;
		}
		}
		System.out.println();
		//for checking the repeated char
		for(char c:strArray)
		{
		if(CountMap.get(c)>1)
		
		{
			System.out.println("First repeated character "+ ": " + input+" "+c);
			break;
		}
		}
	}
}	