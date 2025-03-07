// Main.java
// Name:Nidhi Pandit
// PRN: 23070126081
// Batch: B1

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nSelect Shape:");
            System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Sphere\n5. Cylinder\n6. Equilateral Pyramid\n7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter radius of Circle: ");
                    double radius = scanner.nextDouble();
                    Shape circle = new Circle(radius);
                    displayResults(circle);
                    break;
                case 2:
                    System.out.print("Enter length of Rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of Rectangle: ");
                    double width = scanner.nextDouble();
                    Shape rectangle = new Rectangle(length, width);
                    displayResults(rectangle);
                    break;
                case 3:
                    System.out.print("Enter side of Square: ");
                    double side = scanner.nextDouble();
                    Shape square = new Square(side);
                    displayResults(square);
                    break;
                case 4:
                    System.out.print("Enter radius of Sphere: ");
                    double sphereRadius = scanner.nextDouble();
                    Volume sphere = new Sphere(sphereRadius);
                    displayResults(sphere);
                    break;
                case 5:
                    System.out.print("Enter radius of Cylinder: ");
                    double cylRadius = scanner.nextDouble();
                    System.out.print("Enter height of Cylinder: ");
                    double cylHeight = scanner.nextDouble();
                    Volume cylinder = new Cylinder(cylRadius, cylHeight);
                    displayResults(cylinder);
                    break;
                case 6:
                    System.out.print("Enter base side of Pyramid: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height of Pyramid: ");
                    double height = scanner.nextDouble();
                    Volume pyramid = new EquilateralPyramid(base, height);
                    displayResults(pyramid);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);
        scanner.close();
    }

    public static void displayResults(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
    }
    
    public static void displayResults(Volume volume) {
        System.out.println("Volume: " + volume.calculateVolume());
    }
}
