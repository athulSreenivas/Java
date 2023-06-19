import java.util.Scanner;

class Employee {
    int empid;
    String name;
    double salary;
    String address;

    public Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department;
    String subjectTaught;

    public Teacher(int empid, String name, double salary, String address, String department, String subjectTaught) {
        super(empid, name, salary, address);
        this.department = department;
        this.subjectTaught = subjectTaught;
    }

    public void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject Taught: " + subjectTaught);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for teacher " + (i + 1));
            System.out.print("Employee ID: ");
            int empid = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Subject Taught: ");
            String subjectTaught = scanner.nextLine();

            teachers[i] = new Teacher(empid, name, salary, address, department, subjectTaught);
        }

        System.out.println("\nTeacher Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nTeacher " + (i + 1) + " details:");
            teachers[i].display();
        }
    }
}

