//5. Write a program to check a number is odd or even.

import java.util.Scanner;
class Check_odd
{
    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
        sc.close();
    }
}

