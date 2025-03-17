import java.util.Scanner;
public class Sum{
        public static void main(String arg[]){
                Scanner s=new Scanner(System.in);
                System.out.print("Enter the number:");
                int n=s.nextInt();
                int sum=0;
                for(int i=1;i<=n;i++)
                {
                        sum=sum+i;
                }
                System.out.println("Sum="+sum);
        }
}
