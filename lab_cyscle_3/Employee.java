import java.util.*;

class Employee{

	String name,empid,salary,address;

	Employee(String i,String n,String sal,String address){
		this.empid=i;
		this.name=n;
		this.salary=sal;
		this.address=address;
	}


	public void display(){
		
		System.out.println("Employee Id : "+this.empid+"\nName : "+this.name+"\nSalary : "+this.salary+"\nAddress : "+this.address);
		
	}
}

class Teachers extends Employee{

	String department,subject;

	Teachers(Map<String ,String> teacher){
		super(teacher.get("id"),teacher.get("name"),teacher.get("salary"),teacher.get("address"));
		this.department=teacher.get("department");
		this.subject=teacher.get("subject");
	}


	public void display(){
		super.display();
		System.out.println("Department : "+this.department+"\nSubject : "+this.subject);
	}
}	
		
	

class Main{

	public static Map read(Scanner read){
	
		Map<String,String> emp=new HashMap();

		System.out.println("Enter Employee Id");
		String id=read.next();

		System.out.println("Enter Employee Name");
		String name=read.next();

		System.out.println("Enter Employee Salary");
		String salary=read.next();

		System.out.println("Enter Employee Address");
		String address=read.next();

		System.out.println("Enter Employee Department");
		String department=read.next();

		System.out.println("Enter Employee Subject");
		String subject=read.next();

		
		emp.put("id",id);
		emp.put("name",name);
		emp.put("salary",salary);
		emp.put("address",address);
		emp.put("department",department);
		emp.put("subject",subject);
		
		return emp;
				
	}

		
	public static void main(String[] args){
		
		
	 Scanner read=new Scanner(System.in);

	 System.out.println("Enter Number of Employee");

	 int n=read.nextInt();

	 Teachers EmpArray[]= new Teachers[n];
	
	 for(int i=0;i<n;i++){
		
		Map<String,String> emp=read(read);

		EmpArray[i]=new Teachers(emp);					
		
	 }

	System.out.println("Employee Are");

	 for(int i=0;i<n;i++){
		
		Teachers p=EmpArray[i];
		System.out.println("*****Details*****");
		p.display();
		}					
	 }	
}	
