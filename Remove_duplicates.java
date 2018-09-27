package Array;
import java.util.List; 
import java.util.ArrayList; 

public class Remove_Duplicate_array {

	public static void main(String[] args) {
		
		List obj = new ArrayList();
	
	         obj.add(23);
	         obj.add(34);
	         obj.add(45);
	         obj.add(10);
	         obj.add(34);       
		//System.out.println(obj);
		//    obj.remove(2);
		System.out.println(obj);
		System.out.println(obj.get(0));//23
		System.out.println(obj.size());//5
		
		int length=obj.size();//5
				
		for(int i=0; i<length;i++)
		{
			for(int j=i+1; j<length;j++)
			{
				if(obj.get(i)==obj.get(j))
				{
					obj.remove(j);
					i=0;
					j=0;
					length=length-1;
					
				}
			}
			
		}
		
		System.out.println(obj);
		
}

}

Result:-

[23, 34, 45, 10, 34]
23
5
[23, 34, 45, 10]
