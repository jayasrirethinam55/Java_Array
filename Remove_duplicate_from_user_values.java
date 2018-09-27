package Array;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList; 

public class ArrayListFromUser {

	public static void main(String[] args) {
		
		List obj = new ArrayList();
	
	    Scanner sc = new Scanner (System.in);
	    
	    System.out.println("Enter how many array elements");
	    int count=sc.nextInt();
	    
	    for(int i=0; i<count; i++)
	    {
	    	System.out.println("Enter "+(i+1)+"st elements");
	    	int input =sc.nextInt();
	    	obj.add(input);
	    	
	    }
	    System.out.println(obj);
	    
	    int length = obj.size();
	    
	    for(int j=0; j<length; j++)
	    {
	    	for(int k=j+1 ; k<length;k++)
	    	{
	    		if(obj.get(j)==obj.get(k))
	    		{
	    			obj.remove(k);
	    			length=length-1;
	    			j=0;
	    			k=0;
	    		}
	    	}
	    	
	    }
		System.out.println(obj);
			
		
}

}

Result:-

Enter how many array elements
6
Enter 1st elements
12
Enter 2st elements
34
Enter 3st elements
23
Enter 4st elements
12
Enter 5st elements
23
Enter 6st elements
34
[12, 34, 23, 12, 23, 34]
[12, 34, 23]
