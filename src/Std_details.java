//7.	Write a program to accept the SIC, name, branch and marks of six subjects using command line argument. Calculate the average marks.
public class Std_details {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Error message ");
            return;
        }
        String sic = args[0];
        String name = args[1];
        String branch = args[2];
        double total = 0;
        for (int i = 3; i < 9; i++) {
            total += Double.parseDouble(args[i]);
        }
        double avg = total / 6.0;

        System.out.println("Student_details");
        System.out.println("SIC :" + sic);
        System.out.println("Name :" + name);
        System.out.println("Branch :" + branch);
        System.out.println("Average :" + avg);
    }
}

