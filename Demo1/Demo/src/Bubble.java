import java.util.Scanner;

public class Bubble
{
	void bubblesort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
			    if (arr[j] < arr[j+1]) 
		          { 
			    	 	int temp=arr[j];
			     		arr[j]=arr[j+1];
			     		arr[j+1]=temp;
				}
			}
		}
			
	}
	void printArray(int arr[])
	{
			int n = arr.length; 
	        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    
	}
	
	public static void main(String args[])
	{
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter array size");
	    int arrSize=sc.nextInt();
	    int arr[]=new int[arrSize];
	    System.out.println("Enter the elements");

	    for(int i=0;i<arrSize;i++)
	    {
	     arr[i]=sc.nextInt();	
	    }
	    sc.close();
	    System.out.println("Elements before Sorted");
	 	for (int i=0;i<arrSize;i++)
		{
			System.out.print(arr[i]+" ");
		}System.out.println();
		System.out.println("Sorted array is :");
		Bubble ob=new Bubble();
		ob.bubblesort(arr);
		ob.printArray(arr);
		
	}
	
}





//public class Bubble 
//{ 
//    void bubbleSort(int arr[]) 
//    { 
//        int n = arr.length; 
//        for (int i = 0; i < n-1; i++) 
//            for (int j = 0; j < n-i-1; j++) 
//                if (arr[j] > arr[j+1]) 
//                { 
//                    // swap temp and arr[i] 
//                    int temp = arr[j]; 
//                    arr[j] = arr[j+1]; 
//                    arr[j+1] = temp; 
//                } 
//    } 
//  
//    /* Prints the array */
//    void printArray(int arr[]) 
//    { 
//        int n = arr.length; 
//        for (int i=0; i<n; ++i) 
//            System.out.print(arr[i] + " "); 
//        System.out.println(); 
//    } 
//  
//    // Driver method to test above 
//    public static void main(String args[]) 
//    { 
//        Bubble ob = new Bubble();
//        
//        int arr[] = {64, 34, 25, 12, 22, 11, 90};
//        for(int i=0;i<arr.length;i++)
//        {
//        	 System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//       
//        ob.bubbleSort(arr); 
//        System.out.println("Sorted array"); 
//        ob.printArray(arr); 
//    } 
//} 