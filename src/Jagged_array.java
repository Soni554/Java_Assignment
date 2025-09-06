//8.	Write a program to input a jagged array and display it.
import java.util.Scanner;

public class Jagged_array {
        public static void main(String []s){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the size of row in array:");
            int row = sc.nextInt();
            int [][]jagged = new int[row][];
            for(int i=0;i<row;i++){
                System.out.println("enter the columns for row" + i + ":");
                int col =sc.nextInt();
                jagged[i] = new int[col];
                System.out.println("Enter "+ col + "element for row" +i+ ":");
                for(int j=0;j<col;j++){
                    jagged[i][j] = sc.nextInt();
                }
            }
            System.out.println("the jagged array:");
            for(int i=0;i<jagged.length;i++)
            {
                for(int j=0;j<jagged[i].length;j++){
                    System.out.println(jagged[i][j] +" ");
                }
                System.out.println();
            }

        }


}
