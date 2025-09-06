//1.	Write a program to search an element present in the array.
import java.util.Scanner;
public class Search {
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
        System.out.println("enter the element to search:");
        int search = sc.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++)
        {
            if(search == a[i])
            {
                System.out.println("found :"+ a[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("not found");
        }
        sc.close();
    }
}
