import java.util.Scanner;

public class LAB_2_6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int m1[][] = new int[3][2];
        System.out.println("Matrix 1");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print("Element "+(j+1)+" ");
                System.out.print("For m1"+"["+i+"]"+"["+j+"]"+": ");
                m1[i][j] = input.nextInt();
            }
        }
        int m2[][] = new int[2][3];
        System.out.print("Matrix 1");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("Element "+(j+1)+": ");
                System.out.print("For m2"+"["+i+"]"+"["+j+"]"+": ");
                m2[i][j] = input.nextInt();
            }
        }
        int sum = 0;
        int r[][] = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<2;k++)
                {
                    sum = sum+m1[i][k]*m2[k][j];
                }
                r[i][j]=sum;
               sum=0;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }
    }
}
