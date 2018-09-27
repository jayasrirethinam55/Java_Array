package Array;

public class SecondLargest {

	public static void main(String args[])
	{
	int arr[] = {34,22,14,56,78,65,88,90,8,72,13};
	int largest = arr[0];
	int secondLargest = arr[0];

	for (int i = 0; i < arr.length; i++) 
	{
		if (arr[i] > largest)
		{			
			secondLargest = largest;
			largest = arr[i];
		} 
		/*else if (arr[i] > secondLargest) 
		{
			secondLargest = arr[i];
        }*/
	}

	 System.out.println("Second largest no is " + secondLargest);
   }
}

Result:-
Second largest no is 88
