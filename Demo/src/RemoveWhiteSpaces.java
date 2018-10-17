
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
	
		String str="the man of the man";
		System.out.print("Before removing spaces: ");
		System.out.println(str);
	//	String str1=str.replaceAll("\\s", "");
		
		//System.out.println(str1);
		StringBuffer sb=new StringBuffer();
		
		char[] strArray=str.toCharArray();
				for (int i=0;i<strArray.length;i++)
			{
				if((strArray[i]!=' ')&&(strArray[i]!='\t'))
				{
					sb.append(strArray[i]);
				}
			
			}
						
				
	System.out.println(sb);
		

	}

}
