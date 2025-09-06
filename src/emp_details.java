//6.	Write a program that will take employee id, employee name, department number, salary from the command prompt. If the user does not provide exactly two numbers of arguments then the program should display error message. Use methods display() to display the record of employee.
public class emp_details{
    int emp_id;
    String emp_name;
    int dept_no;
    double salary;
     emp_details(int id, String name, int dept, double sal) {
         emp_id = id;
         emp_name = name;
         dept_no = dept;
         salary = sal;
     }


    //method to display employee details
    void display(){
        System.out.println("Employee_details");
        System.out.println("Id :" + emp_id);
        System.out.println("Name :" + emp_name);
        System.out.println("department :" + dept_no);
        System.out.println("salary :" + salary);
    }

        public static void main(String[] args) {
            if (args.length != 4){
                System.out.println("Error message ");
                return;
            }
            int id = Integer.parseInt(args[0]);
            String name = args[1];
            int dept = Integer.parseInt(args[2]);
            double sal = Integer.parseInt(args[3]);

           emp_details e =new emp_details(id,name,dept,sal);
            e.display();

    }


}
