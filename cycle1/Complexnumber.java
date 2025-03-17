import java.util.Scanner;
public class Complexnumber{
	double real;
	double imaginary;
Complexnumber(double r,double i){
	this.real=r;
	this.imaginary=i;

}
static public Complexnumber add(Complexnumber c1,Complexnumber c2){
	return new Complexnumber(c1.real+c2.real,c1.imaginary+c2.imaginary);

}
static public Complexnumber multiply(Complexnumber c1,Complexnumber c2){
	double realpart=c1.real*c2.real-c1.imaginary*c2.imaginary;
	double imaginarypart=c1.real*c2.imaginary+c1.imaginary*c2.real;
	return new Complexnumber(realpart,imaginarypart);
}
void display(){
System.out.print(real + "+" + imaginary + "i");
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the real and imaginay part of first number:");
	double real1=s.nextInt();
	double imaginary1=s.nextInt();
	System.out.println("enter the real and imaginay part of second number:");
        double real2=s.nextInt();
        double imaginary2=s.nextInt();
	Complexnumber c1=new Complexnumber(real1,imaginary1);
	Complexnumber c2=new Complexnumber(real2,imaginary2);
	int choice;
	do{
	System.out.println("\n1.Add");
	System.out.println("2.Multiply");
	System.out.println("3.Exit");
	System.out.println("enter your choice:");
	choice=s.nextInt();
	switch(choice){
	case 1:
	Complexnumber sum=add(c1,c2);
	System.out.println("Sum:");
	sum.display();
	break;
	case 2:
        Complexnumber product=multiply(c1,c2);
        System.out.println("product:");
        product.display();
        break;
	case 3:
	System.out.println("exiting");
	break;

}
}while(choice!=3);


}

}
