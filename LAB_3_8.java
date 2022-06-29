import java.util.Scanner;
public class LAB_3_8
{
    public static void main(String[] args)
    {
        Employee_Detail e1 = new Employee_Detail();
        e1.get();
        e1.display();
    }
}
class Employee_Detail
{
    int     Employee_id;
    String  Name;
    String  Designation;
    double  Salary;

    Scanner input = new Scanner(System.in);
    void get()
    {
        System.out.print("ENTER Employee_id: ");
        Employee_id = input.nextInt();
        System.out.print("ENTER Name: ");
        Name = input.next();
        System.out.print("ENTER Designation: ");
        Designation = input.next();
        System.out.print("ENTER Salary: ");
        Salary = input.nextDouble();
    }
    void display()
    {
        System.out.println("Employee_id = "+Employee_id);
        System.out.println("Name = "+Name);
        System.out.println("Designation = "+Designation);
        System.out.println("Salary = "+Salary);
    }
}
