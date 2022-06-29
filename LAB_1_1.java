import java.util.Scanner;
public class LAB_1_1
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number:  ");
        int n = input.nextInt();
        int p=1;
        for(int i=n;i>0;i--)
        {
            p=p*i;
            if(i==1)
            {
                System.out.print(i);
            }
            else
            {
                System.out.print(i+" * ");
            }

        }
        System.out.print(" = "+p);

    }
}
