import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

interface Benefits {
    double calculateBenefits();
}

class Manager extends Employee implements Benefits {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }

    @Override
    public double calculateBenefits() {
        return 5000;
    }

    void assignProject(String projectName) {
        System.out.println(name + " assigned to project: " + projectName);
    }

    void assignProject(String projectName, int teamSize) {
        System.out.println(name + " assigned to project: " + projectName + " with team size: " + teamSize);
    }

    void display() {
        displayDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("Benefits: " + calculateBenefits());
    }
}

class Developer extends Employee implements Benefits {
    int experience;

    Developer(String name, double salary, int experience) {
        super(name, salary);
        this.experience = experience;
    }

    @Override
    double calculateSalary() {
        return salary + (experience * 1000);
    }

    @Override
    public double calculateBenefits() {
        return experience * 500;
    }

    void display() {
        displayDetails();
        System.out.println("Experience: " + experience + " years");
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("Benefits: " + calculateBenefits());
    }
}

public class EmployeeManagement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.println("Enter Manager details:");
        System.out.print("Name: ");
        String mgrName = scanner.nextLine();
        System.out.print("Salary: ");
        double mgrSalary = scanner.nextDouble();
        System.out.print("Bonus: ");
        double mgrBonus = scanner.nextDouble();
        scanner.nextLine();
        Manager manager = new Manager(mgrName, mgrSalary, mgrBonus);
        employees.add(manager);

        System.out.println("\nEnter Developer details:");
        System.out.print("Name: ");
        String devName = scanner.nextLine();
        System.out.print("Salary: ");
        double devSalary = scanner.nextDouble();
        System.out.print("Experience (years): ");
        int devExp = scanner.nextInt();
        Developer developer = new Developer(devName, devSalary, devExp);
        employees.add(developer);

        System.out.println("\n--- Employee Details ---");
        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                ((Manager) emp).display();
                ((Manager) emp).assignProject("AI Research");
                ((Manager) emp).assignProject("Cloud Computing", 5);
            } else if (emp instanceof Developer) {
                ((Developer) emp).display();
            }
            System.out.println("----------------------");
        }

    }
}
