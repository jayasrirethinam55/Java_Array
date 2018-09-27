package Array;

public class SecondLargest {

	public static void main(String args[])
	{
	int arr[] = {1,2,3,4,4,4};
	int count=0;
	int temp = 0;
	for (int i = 0; i < arr.length; i++) 
	{
		if (i>2)// index
		{			
			count++;//3
			temp=arr[i];//4
		} 

	}
	 System.out.println(temp+"is"+count+"times");
   }
}



Result:-

4is3times
