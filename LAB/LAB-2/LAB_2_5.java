import java.util.Scanner;

public class LAB_2_5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter elements for matrix 1");
        int m1[][] = new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print("For m1"+"["+i+"]"+"["+j+"]"+": ");
                m1[i][j] = input.nextInt();
            }
        }
        int m2[][] = new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print("For m2"+"["+i+"]"+"["+j+"]"+": ");
                m2[i][j] = input.nextInt();
            }
        }
        int r[][] = new int[2][2];
        System.out.println("The resultant matrix is: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                r[i][j] = m1[i][j] + m2[i][j];
                System.out.print(r[i][j]+"   ");
            }
            System.out.println();
        }

    }
}
