import java.util.Scanner;
public class Stringmanipulation{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the string:");
	String str=s.nextLine();
	int length=str.length();
	System.out.println("length of the string:"+length);
	String uppercasestr=str.toUpperCase();
	System.out.println("uppercase:"+uppercasestr);
	String lowercasestr=str.toLowerCase();
        System.out.println("lowercase:"+lowercasestr);
	System.out.println("enter index to extract character:");
	int index=s.nextInt();
	if(index>=0 && index<length){
	System.out.println("character at index " + index + ": " + str.charAt(index));
	

}
else{
 System.out.println("invalid index:");

}
System.out.println("enter the start and end index for substring:");
        int start=s.nextInt();
	 int end=s.nextInt();
	if(start>=0 && end<=length && start<end){ 
         System.out.println("substring:"+str.substring(start,end));
}
else{ 
 System.out.println("invalid index:");

}
String reversedstr = new StringBuilder(str).reverse().toString(); 
        System.out.println("Reversed string: " + reversedstr);


}

}

