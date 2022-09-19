 import java.util.Scanner;
public class LAB_1_3
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        int count = 0;



            for (int i = 2; i <= n / 2; i++)
            {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }

        if(n==2)
        {
            System.out.println("2 IS AN EVEN PRIME NUMBER");
        }
        else
        {
            if(count==0)
            {
                System.out.println("PRIME NUMBER");
            }

            else
            {
                System.out.println("NON PRIME NUMBER");
            }
        }
    }

}
