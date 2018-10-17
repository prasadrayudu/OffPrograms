public class StringRev_Eachword
{
	static void reverseEachWordofString(String inputStr)
	{
		String[] words=inputStr.split(" ");// "toCharArray();
		String reverse =" ";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword=reverseword+word.charAt(j);
			}
			reverse=reverse+reverseword+" ";
			
			
			
			
		}System.out.println(inputStr);
		System.out.println(reverse);
		
				
		
	}
	
	public static void main(String args[])
	{
		reverseEachWordofString("java concept of the day");		
		
	}
			
}
















//public class StringRev_Eachword
//{
//    static void reverseEachWordOfString(String inputString)
//    {
//        String[] words = inputString.split(" ");
//         
//        String reverseString = "";
//         
//        for (int i = 0; i < words.length; i++) 
//        {
//            String word = words[i];
//             
//            String reverseWord = "";
//             
//            for (int j = word.length()-1; j >= 0; j--) 
//            {
//                reverseWord = reverseWord + word.charAt(j);
//            }
//             
//            reverseString = reverseString + reverseWord + " ";
//        }
//         
//        System.out.println(inputString);
//         
//        System.out.println(reverseString);
//         
//        System.out.println("-------------------------");
//    }
//     
//    public static void main(String[] args) 
//    {
//        reverseEachWordOfString("Java Concept Of The Day");
//         
//        reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");
//         
//        reverseEachWordOfString("I am string not reversed");
//         
//        reverseEachWordOfString("Reverse Me");
//    }
//}