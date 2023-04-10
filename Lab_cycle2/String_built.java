import java.util.*;

class String_built{

	
	
	public static void  main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");

		String str=sc.next();
		
		System.out.println("Length of the string : "+str.length());

		System.out.println("Uppercase of the string : "+str.toUpperCase());

		System.out.println("Enter the Character you want to replace with '0' :");

		char p=sc.next().charAt(0);
		
		System.out.println("Replaced String is : "+str.replace(p,'0'));

		StringBuffer str2=new StringBuffer(str);

		System.out.println("****String Buffer****");

		System.out.println("Capcity of the String is : "+str2.capacity());
		System.out.println("Enter the  String want to append to "+str2);
		String pn=sc.next();
		str2.append(pn);
		System.out.println("The new String : "+str2);
		System.out.println("Capcity of the String is : "+str2.capacity());		
		System.out.println("The reversed String :"+str2.reverse());
		
		
		

	}	

}
