import java.util.Scanner;
public class LAB_3_9
{
    public static void main(String[] args)
    {
        Student_Detail s[] = new Student_Detail[5];
        for(int i=0;i<5;i++)
        {
            s[i] = new Student_Detail();
            s[i].get();
            s[i].display();
        }
    }
}

class Student_Detail
{
    int ID;
    String Name;
    int Sem;
    Scanner input = new Scanner(System.in);
    void get()
    {
        System.out.print("ID : ");
        ID = input.nextInt();
        System.out.print("Name : ");
        Name = input.next();
        System.out.print("Sem : ");
        Sem = input.nextInt();
    }
    void display()
    {
        System.out.print("ID : "+ID);
        System.out.print("Name : "+Name);
        System.out.print("Sem : "+Sem);
    }
}
