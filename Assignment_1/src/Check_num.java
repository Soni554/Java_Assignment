//12. Write a program to test whether a number is positive, negative or equal to zero.

import java.util.Scanner;
class Check_num
{
    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num > 0)
            System.out.println("Positive number");
        else if(num < 0)
            System.out.println("Negative number");
        else
            System.out.println("Number is Zero");
        sc.close();
    }
}

