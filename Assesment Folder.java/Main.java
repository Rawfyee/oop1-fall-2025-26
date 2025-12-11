class Contact {
    private String phone;
    private String email;

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Phone: " + phone + ", Email: " + email;
    }
}

class Student {
    private String name;
    private int id;
    private Contact contact;

    public Student(int id, String name, Contact contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id +
                           ", Name: " + name +
                           ", " + contact);
    }
}

class School {
    private String name;
    private Student[] students;
    private int studentCount = 0;

    public School(String name, int maxStudents) {
        this.name = name;
        this.students = new Student[maxStudents];
    }

    public void addStudent(Student s) {
        if (studentCount < students.length) {
            students[studentCount] = s;
            studentCount++;
        } else {
            System.out.println("Cannot add more students. School is full.");
        }
    }

    public void showStudents() {
        System.out.println("School: " + name);
        for (int i = 0; i < studentCount; i++) {
            students[i].displayInfo();
        }
        System.out.println();
    }
}

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
            System.out.println("Cannot add more employees. Company is full.");
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
        School school = new School("RNG International School", 3);

        Contact c1 = new Contact("01711-111111", "alice@example.com");
        Contact c2 = new Contact("01822-222222", "bob@example.com");

        Student s1 = new Student(1, "Alice", c1);
        Student s2 = new Student(2, "Bob", c2);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showStudents();

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
