//4.	Write a program that performs the addition of two numbers using command-line arguments
public class Add_num {
    public static void main(String[] args){
        //args[0] and args[1] will be the number
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int sum = num1 + num2;
        System.out.println("Sum=" + sum);
    }
}
