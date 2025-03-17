import java.util.Scanner;
interface shape{
	double area();
	double perimeter();
}
class Circle implements shape{
	private double radius;
	public Circle(double radius){
		this.radius=radius;
}
public double area(){
	return Math.PI*radius*radius;
}
public double perimeter(){
	return 2*Math.PI*radius;
}

}
class Rectangle implements shape{
	private double length;
	private double breadth;
public Rectangle(double length,double breadth){
	this.length=length;
	this.breadth=breadth;
}
public double area(){
	return length*breadth;

}
public double perimeter(){
	return 2*(length+breadth);
}
}
class Shapecalculator{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int choice;
		do{
			System.out.println("1.circle");
			System.out.println("2.Rectangle");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			 choice=s.nextInt();
			switch(choice){
			case 1:
			System.out.println("enter the radius of circle:");
			double radius=s.nextDouble();
			Circle circle=new Circle(radius);
			System.out.println("Area of circle:"+circle.area());
			System.out.println("Perimeter of Circle:"+circle.perimeter());
			break;
			case 2:
			System.out.println("enter the length of rectangle:");
                        double length=s.nextDouble();
			System.out.println("enter the breadth of rectangle:");
                        double breadth=s.nextDouble();
                        Rectangle rectangle=new Rectangle(length,breadth);
                        System.out.println("Area of Rectangle:"+rectangle.area());
                        System.out.println("Perimeter of Rectangle:"+rectangle.perimeter());
                        break;
			case 3:
			System.out.println("Existing from the program!!!");
			break;

}
}while(choice!=3);
}

}
