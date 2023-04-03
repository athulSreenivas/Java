import java.util.*;
class Employee{

	String name,empid,salary;

	Employee(String i,String n,String sal){
		this.empid=i;
		this.name=n;
		this.salary=sal;
	}

	public static Map read(Scanner read){
	
		Map<String,String> emp=new HashMap();

		System.out.println("Enter Employee Id");
		String id=read.next();

		System.out.println("Enter Employee Name");
		String name=read.next();

		System.out.println("Enter Employee Salary");
		String salary=read.next();

		
		emp.put("id",id);
		emp.put("name",name);
		emp.put("salary",salary);
		
		return emp;
				
	}

	public void display(){
		
		System.out.println("Employee Id : "+this.empid);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Salary : "+this.salary);
		
	}
		
	public static void main(String[] args){
		
		
	 Scanner read=new Scanner(System.in);

	 System.out.println("Enter Number of Employee");

	 int n=read.nextInt();

	 Employee EmpArray[]= new Employee[n];
	
	 for(int i=0;i<n;i++){
		
		Map<String,String> emp=read(read);

		EmpArray[i]=new Employee(emp.get("id"),emp.get("name"),emp.get("salary"));					
		
	 }

	System.out.println("Employee Id to Search ");
	
	String empid=read.next();	

	 for(int i=0;i<n;i++){
		
		Employee p=EmpArray[i];

		if(p.empid.equals(empid)){

			System.out.println("*****Details*****");
			p.display();
		}					
	 }

	}

		
}	
