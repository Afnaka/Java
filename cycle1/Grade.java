import java.util.Scanner;
public class Grade{
        public static void main(String arg[]){
                Scanner s=new Scanner(System.in);
                System.out.print("Enter the mark:");
                int m=s.nextInt();
              	if(m>=90){
                	System.out.println("Grade A");
		}
		else if(m>=80){ 
                	System.out.println("Grade B");
                }
		else if(m>=70){ 
                        System.out.println("Grade C");
                }
		else if(m>=60){ 
                        System.out.println("Grade D");
                }
		else{ 
                        System.out.println("Grade F");
                }

		
        }
}
