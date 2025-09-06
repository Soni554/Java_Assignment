//2.	Write a program to sort the array of n elements.
import java.util.Scanner;
public class Sort {
    public static void main(String []s){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size in array:");
        int n = sc.nextInt();
        int []a = new int[n];
        System.out.println("enter the element in array:");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        //using insertion sort
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]>a[i])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("the sorted array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}
