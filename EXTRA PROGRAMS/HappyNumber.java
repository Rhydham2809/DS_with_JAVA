import java.util.Scanner;
public class HappyNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to check whether it is happy number or not: ");
        int b = input.nextInt();
        int sum1[] = new int[100];
        double count=0;
        int a=1,i=0,r=0,c=0,sum=0;

        while(a==1)
        {
            sum=0;
            for(;b>0;)
            {
                r=b%10;
                r= (int) Math.pow(r,2);
                sum=sum+r;
                b=b/10;
            }
            System.out.println(sum);
            if(sum==1) {
                break;
            }
            for(int j=0;j<i;j++)
            {
                if(sum1[j]==sum) {
                    System.out.println("Not Happy number");
                    count++;
                    break;
                }
            }
            if(count==1)
            {
                break;
            }
            sum1[i++]=sum;
            b=sum;
            a=1;

        }
        if(count==1)
        {

        }
        else
        {
            System.out.println("HAPPY NUMBER");
        }

    }
}

