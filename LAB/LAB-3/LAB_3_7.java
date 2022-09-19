import java.util.Scanner;

public class LAB_3_7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number 1: ");
        int n1 = input.nextInt();
        System.out.print("Please enter number 2: ");
        int n2 = input.nextInt();

        Manner m1 = new Manner();
        m1.swap(n1,n2);
    }
}

class Manner
{
    void swap(int n1,int n2)
    {
        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        System.out.println("n1 = "+n1);
        System.out.println("n2 = "+n2);
    }
}
