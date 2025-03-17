import java.util.Scanner;
import graphics.*;

public class TestGraphics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        double rectLength = scanner.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double rectWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectLength, rectWidth);

	System.out.println("\nArea of Rectangle: " + rectangle.area());
        System.out.print("\nEnter base of Triangle: ");
        double triBase = scanner.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double triHeight = scanner.nextDouble();
        Triangle triangle = new Triangle(triBase, triHeight);

	System.out.println("\nArea of Triangle: " + triangle.area());
        System.out.print("\nEnter side of Square: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);
	System.out.println("\nArea of Square: " + square.area());
        System.out.print("\nEnter radius of Circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);

	System.out.println("\nArea of Circle: " + circle.area());


        scanner.close();
	}
}
