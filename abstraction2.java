abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void showDetails() {
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

public class abstraction2 {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee("Areeb", 50000);
        emp.showDetails();
        System.out.println("Monthly Salary: " + emp.calculateSalary());
    }
}
