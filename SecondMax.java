import java.util.Scanner;
public class SecondMax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of array:");
        int n = input.nextInt();
        int arr[] = new int[n];
        int max=0;
        int max2=0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter number for element "+(i+1)+": ");
            arr[i] = input.nextInt();
            if(arr[i]>=max)
            {
                max2 = max;
                max = arr[i];
                // System.out.println(arr[i]);

            }

        }
        // for(int i=0;i<n;i++)
        // {

        // }
        // System.out.println(max2);


    }
}
