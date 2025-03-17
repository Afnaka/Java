import java.util.Scanner;
public class Odd{
        public static void main(String arg[]){
       		Scanner s=new Scanner(System.in);
        	System.out.print("Enter the number:");
		int num=s.nextInt();
        	if(num%2==0){
                	System.out.println("Even");
        	}
        	else{
                	System.out.println("Odd");
        	}
        }
}

