import java.util.Scanner;
public class Mtrixaddition{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the number of rows");
int rows=s.nextInt();
System.out.println("enter the number of columns");
int columns=s.nextInt();
int[][]matrix1=new int[rows][columns];
int[][]matrix2=new int[rows][columns];
int[][]summatrix=new int[rows][columns];
System.out.println("enter the elements of the first matrix:");
for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	matrix1[i][j]=s.nextInt();

}
}
System.out.println("enter the elements of the second matrix:");
for(int i=0;i<rows;i++){ 
        for(int j=0;j<columns;j++){ 
        matrix2[i][j]=s.nextInt();
}
}
for(int i=0;i<rows;i++){ 
        for(int j=0;j<columns;j++){ 
       summatrix[i][j]=matrix1[i][j]+matrix2[i][j];

}
}
System.out.println("sum of two matrix:");
for(int i=0;i<rows;i++){ 
        for(int j=0;j<columns;j++){ 
        System.out.print(summatrix[i][j]+" ");

}
System.out.println();
}

}

}
