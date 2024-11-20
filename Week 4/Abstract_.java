import java.util.Scanner;


abstract class Shape {
    int dimension1;
    int dimension2;

   
    abstract void printArea();
}

class Rectangle extends Shape {

   
    public Rectangle(int length, int width) {
        this.dimension1 = length;
        this.dimension2 = width;
    }

   
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Rectangle Area: " + area);
    }
}

class Triangle extends Shape {

   
    public Triangle(int base, int height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

   
   
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Triangle Area: " + area);
    }
}

class Circle extends Shape {
    private final double pi = 3.14159;

   
    public Circle(int radius) {
        this.dimension1 = radius;
        this.dimension2 = 0;  
    }

   
    void printArea() {
        double area = pi * dimension1 * dimension1;
        System.out.println("Circle Area: " + area);
    }
}
public class Abstract_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       
        System.out.print("Enter length of rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter width of rectangle: ");
        int width = scanner.nextInt();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.printArea();

       
        System.out.print("Enter base of triangle: ");
        int base = scanner.nextInt();
        System.out.print("Enter height of triangle: ");
        int height = scanner.nextInt();
        Triangle triangle = new Triangle(base, height);
        triangle.printArea();

        System.out.print("Enter radius of circle: ");
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);
        circle.printArea();

        scanner.close();
    }
}
