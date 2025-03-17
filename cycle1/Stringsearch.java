import java.util.Scanner;
public class Stringsearch{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.print("enter the number of strings:");
	int n=s.nextInt();
	s.nextLine();
	String[]strings=new String[n];
	System.out.println("enter Strings");
	for(int i=0;i<n;i++){
	System.out.print("Strings"+(i+1)+":");
	strings[i]=s.nextLine();
	
}
System.out.print("enter the string to be search:");
String searchstr=s.nextLine();
int index=-1;
for(int i=0;i<n;i++){
	if(strings[i].equals(searchstr)){
		index=i;
		break;
}

}
if(index==-1){
System.out.print("string not found");
}
else{
System.out.println("string found at index"+index);
}
}

}
