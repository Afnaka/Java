import java.util.Scanner;
class Product{
	String pcode;
	String pname;
	double price;
public void setproductdetails(String pcode,String pname,double price){
	this.pcode=pcode;
	this.pname=pname;
	this.price=price;
}
public void display(){
	System.out.println("product code:"+pcode);
	System.out.println("product name:"+pname);
	System.out.println("price:"+price);

}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of product:");
	int n=s.nextInt();
	s.nextLine();
	Product[]products=new Product[n];
	for(int i=0;i<n;i++){
	products[i]=new Product();
	System.out.println("\n enter the details for product"+(i+1)+":");
	System.out.println("product code:");
	String pcode=s.nextLine();
	System.out.println("product name:");
        String pname=s.nextLine();
	System.out.println("price:");
	double price=s.nextDouble();
	s.nextLine();
	products[i].setproductdetails(pcode,pname,price);

}
Product lowestprice=products[0];
for(int i=1;i<n;i++){
	if(products[i].price < lowestprice.price){
		lowestprice=products[i];
}
}
System.out.println("product with lowest price:");
lowestprice.display();
}
}
