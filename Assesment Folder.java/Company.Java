class Position {
    private String title;
    private double salary;

    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Salary: " + salary;
    }
}

class Employee {
    private int id;
    private String name;
    private Position position;

    public Employee(int id, String name, Position position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id +
                           ", Name: " + name +
                           ", " + position);
    }
}

class Company {
    private String name;
    private Employee[] employees;
    private int employeeCount = 0;

    public Company(String name, int maxEmployees) {
        this.name = name;
        this.employees = new Employee[maxEmployees];
    }

    public void addEmployee(Employee e) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = e;
            employeeCount++;
        } else {
            System.out.println("Company is full.");
        }
    }

    public void showEmployees() {
        System.out.println("Company: " + name);
        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayInfo();
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Company company = new Company("RNG Gamez", 3);

        Position p1 = new Position("Game Developer", 60000);
        Position p2 = new Position("QA Engineer", 45000);

        Employee e1 = new Employee(101, "Charlie", p1);
        Employee e2 = new Employee(102, "Diana", p2);

        company.addEmployee(e1);
        company.addEmployee(e2);

        company.showEmployees();
    }
}
