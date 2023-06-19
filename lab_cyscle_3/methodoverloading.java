import java.util.*;



class Shapes{
	
	public static void main(String[] args){
		
		Shapes shape=new Shapes();
		Scanner number=new Scanner(System.in);
		float l=read(number,"lenght");
		float b=read(number,"breadth");
		shape.area(l,b);
		float r=read(number,"radius");
		shape.area(r,"circle");
		float s=read(number,"Side");
		shape.area(s,"Square");
		
	}

	static float read(Scanner number,String character){
		System.out.println("Enter the "+character+" ");
		float a=number.nextFloat();
		return a;
	}	

	void area(float length,float breadth){
		float area=length*breadth;
		System.out.println("The area of the rectangle is "+area);
	}
	void area(float radius,String type){
		if(type=="circle"){
			float ar=(float)3.14*(radius*radius);
			System.out.println("The area of circle is "+ar);
		}
		else{
			float area=radius*radius;
			System.out.println("The area of square is "+area);		
		}
	}
}
