//5.	Write a program that will take two integer numbers from the command prompt and find their GCD. If the user does not provide exactly two numbers of arguments then the program should display error message.
public class GCD {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        if (args.length < 2){
            System.out.println("Error message ");
        return;
    }
        while(num2 != 0){
            int temp = num2;
            num2 =num1 % num2;
            num1 = temp;
        }
        System.out.println("GCD = " + num1);
    }
}
