//3.	Write a program input two matrices and perform the addition of two matrices.
import java.util.Scanner;
public class Add_matrix {
    public static void main(String []s){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of  row and col:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][]a1 = new int[row][col];
        System.out.println("enter the matrix of array:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++) {
                a1[i][j] = sc.nextInt();
            }
        }
        int [][]a2 = new int[row][col];
        System.out.println("enter the row and col in array2:");
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                a2[i][j] = sc.nextInt();
            }
        }
        int [][]a=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j] = a1[i][j]+a2[i][j];
            }
        }
        System.out.println("the sum of two matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }
}
