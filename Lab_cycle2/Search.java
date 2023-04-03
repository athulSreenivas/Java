import java.util.*;
class Search{
	
		
	
	public static void main(String[] args){
		int flag=0,i=0;
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size of the array..");
		int limit=read.nextInt();		
		int arr[]=new int[limit];
		System.out.println("Enter the elements to the array..");
		for(i=0;i<limit;i++){
			arr[i]=read.nextInt();		
		}
		System.out.println("The array is:");
		for(i=0;i<limit;i++){
				System.out.println(arr[i]);	
		}
		System.out.println("Enter the element you want to search for:");
		int key=read.nextInt();
		for(i=0;i<limit;i++){
				if(arr[i]==key){
					flag=1;
					break;				
				}	
		}

		if(flag == 1)
        	{

            	System.out.println("Element found at position:"+i);

        	}

        	else

        	{

            	System.out.println("Element not found");

        	}
	
		}
}	
