
import java.util.*;



class Shapes{

	public static void main(String args[]){
		
		
		Shapes rec= new Shapes();
		Scanner sc=new Scanner(System.in);
		float l= read(sc,"Length");
		float b= read(sc,"Breadth");
		rec.area(l,b);
		float r= read(sc,"Radius");
		rec.area(r,"c");
		float s= read(sc,"Side");
		rec.area(s,"s");
		
	}

	static float read(Scanner sc,String type){
		
		System.out.println("Enter the "+type+" :");
		float p= sc.nextFloat();
		return p;
			
	}	
		
	void area(float l,float b){
	
		
		System.out.println("Area of Rectangle is  : "+(l*b));	
	}

	void area(float r,String type){

		if(type=="c"){
		float ar= (float) 3.14*(r*r);

		System.out.println("Area of Circle is  : "+(ar));
		}else{
		
			System.out.println("Area of Square is  : "+(r*r));		
		}
	
			
		
	}



}
