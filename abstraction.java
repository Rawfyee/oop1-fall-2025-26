abstract class Shape {
    abstract double calculateArea();

    void displayShape() {
        System.out.println("This is a shape.");
    }}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width; }

    double calculateArea() {
        return length * width;
    }   }

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.1416 * radius * radius;
}}

public class abstraction {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(3, 4);
        s1.displayShape();
        System.out.println("Rectangle Area: " + s1.calculateArea());

        Shape s2 = new Circle(3);
        s2.displayShape();
        System.out.println("Circle Area: " + s2.calculateArea());
    }
}
