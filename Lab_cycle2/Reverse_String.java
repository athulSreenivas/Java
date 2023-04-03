
import java.util.*;

class Reverse_String{
	
	public static void main(String[] args){
		
		Scanner read=new Scanner(System.in);

		System.out.println("Enter the String Want to sort");

		String strin=read.nextLine();

		String words[]=strin.split(" ");

		Arrays.sort(words);
	
		String fin="";
		
		for(int i=0;i<words.length;i++){
				
				fin+=words[i]+" ";
		}

		System.out.println("Sorted String");
		
		System.out.println(fin);

	}
}


