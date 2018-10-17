
public class Bottle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i=99;
		String st=" Bottles of Beer ";
		
		while(i>1)
			{
			System.out.println(i + st + i +" bottles of beer on the war");
			if((i-1)==1){
			System.out.println("Take one down, "+(i-1)+"bottle of beer on the war");
			}else
			{
				System.out.println("Take one down, "+(i-1)+" bottles of beer on the war");
			}
			System.out.println();
			
			i--;
			
				if(i==1)
				{

					System.out.println(i + " Bottle of beer "+ i +"bottle of beer on the war");
					System.out.println("Take one down, "+ "No more bottles on the wall");
					System.out.println("No more bottles beer on the wall,please go to the store and full 99 bottles of the beer");
				}
			}
		}
	}

/*
if(i==1)
		{
			System.out.println(i + st + i +"bottle of beer on the war");
			System.out.println("Take one down, "+ "No more bottles on the wall");
			System.out.println("No more bottles beer on the wall,please go to the store and full 99 bottles of the beer");
		}
		else
			{


*/