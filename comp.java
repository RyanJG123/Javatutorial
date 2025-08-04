import java.util.Scanner;

class Employee {
    String name;
    int age;
    int number;
    String address;
    double salary;

    Employee(String name, int age, int number, String address, double salary) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.address = address;
        this.salary = salary;
    }

    void printSalary()
	{
        System.out.println("Salary = " + salary);
    }

    void printEmployeeDetails() 
	{
        System.out.println("Employee Details");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Address = " + address);
        System.out.println("Number = " + number);
        printSalary();
    }
}

class Manager extends Employee 
{
    String department;
    Manager(String name, int age, int number, String address, double salary, String department) {
        super(name, age, number, address, salary);
        this.department = department;
    }

    void printManagerDetails() {
        System.out.println("Manager Details");
        printEmployeeDetails();
        System.out.println("Department = " + department);
    }
}
class Officer extends Employee{
    String specialization;
    Officer(String name, int age, int number, String address, double salary, String specialization) {
        super(name, age, number, address, salary);
        this.specialization = specialization;
    }

    void printOfficerDetails() {
        System.out.println("Officer Details");
        printEmployeeDetails();
        System.out.println("Specialization = " + specialization);
    }
}

public class Company{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter Manager Details:");
        sc.nextLine(); // consume newline if needed
        System.out.print("Name: ");
        String mName = sc.nextLine();
        System.out.print("Age: ");
        int mAge = sc.nextInt();
        System.out.print("Number: ");
        int mNumber = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Address: ");
        String mAddress = sc.nextLine();
        System.out.print("Salary: ");
        double mSalary = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Department: ");
        String mDepartment = sc.nextLine();
        System.out.println("\nEnter Officer Details:");
        System.out.print("Name: ");
        String oName = sc.nextLine();
        System.out.print("Age: ");
        int oAge = sc.nextInt();
        System.out.print("Number: ");
        int oNumber = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Address: ");
        String oAddress = sc.nextLine();
        System.out.print("Salary: ");
        double oSalary = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Specialization: ");
        String oSpecialization = sc.nextLine();

        Manager manager = new Manager(mName, mAge, mNumber, mAddress, mSalary, mDepartment);
        Officer officer = new Officer(oName, oAge, oNumber, oAddress, oSalary, oSpecialization);

        System.out.println("\n--- Company Records ---");
        manager.printManagerDetails();
        officer.printOfficerDetails();

        sc.close();
    }
}
