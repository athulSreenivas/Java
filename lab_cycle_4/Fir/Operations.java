import Arithmetic.*;
import java.util.*;

class Main{

	
	public static int read(Scanner sc,String d){
	
		System.out.println("Enter "+d+" numbers :");
		
		return sc.nextInt();
		
	}

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		int d,f,s;double res;Addition ad;Substraction sub;Division div;Multiplication mul;
		
		do{				

		System.out.println("Enter the given option \n1:Addition\n2:Sustraction\n3:Division\n4:Multiplication\n5:Exit");
		 d=sc.nextInt();
			
		switch(d){
			
		case 1:	
			 f= read(sc,"First");
			 s= read(sc,"Second");
			 ad=new Addition();
			 res=ad.calculate(f,s);
			System.out.println(res);
			break;
		case 2:	
			 f= read(sc,"First");
			 s= read(sc,"Second");
			 sub=new Substraction();
			 res=sub.calculate(f,s);
			System.out.println(res);
			break;
		case 3:	
			 f= read(sc,"First");
			 s= read(sc,"Second");
			 div=new Division();
			 res=div.calculate(f,s);
			System.out.println(res);
			break;	
		case 4:	
			 f= read(sc,"First");
			 s= read(sc,"Second");
			 mul=new Multiplication();
			 res=mul.calculate(f,s);
			System.out.println(res);
			break;	
		default:
			System.out.println("Exiting.........");
		}			
	
		}while(d!=5);		

	}
}
