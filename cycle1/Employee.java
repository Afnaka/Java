import java.util.Scanner;
class Employee{
	int Emp_no;
	String Name;
	Double salary;

Employee(int Emp_no,String Name,Double salary){
	this.Emp_no=Emp_no;
	this.Name=Name;
	this.salary=salary;
}
void display(){
	System.out.println("Details.....");
	System.out.println("Emp_no:"+Emp_no);
	System.out.println("Employee name:"+Name);
	System.out.println("Salary of Employee:"+salary);

}

public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of Employees:");
        int n=s.nextInt();
        s.nextLine();
        Employee[]employees=new Employee[n];
        for(int i=0;i<n;i++){
        System.out.println("\n enter the details of Employees"+(i+1)+":");
        System.out.print("Employee id:");
        int Emp_no=s.nextInt();
	s.nextLine();  
        System.out.print("Employee name:");
        String Name = s.nextLine();
        System.out.print("Employee Salary:");
        double salary=s.nextDouble();
        s.nextLine();
        employees[i]=new Employee(Emp_no,Name,salary);
}
	System.out.println("Enter the Emp_no to search");
	int search_no=s.nextInt();
	int found=0;
	for(int i=0;i<employees.length;i++){
		Employee emp=employees[i];
		if(emp.Emp_no==search_no){
			System.out.println("Employee found");
			emp.display();
			found=1;
			break;

}
}
if(found==0){
	System.out.println("Emp_no not found");
}
}
}


