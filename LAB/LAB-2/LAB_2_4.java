import java.util.Scanner;
public class LAB_2_4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of input  ");
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter input value for element"+(i+1)+": ");
            arr[i] = input.nextInt();
        }
        System.out.print("Please enter number you want to replace: ");
        int r = input.nextInt();
        System.out.print("Please enter number you want to replace with: ");
        int num = input.nextInt();
        int count=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                arr[i] = r;
                System.out.println(num+" found at index "+i+" successfully replaced with "+r);
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Number does not exists in array inputted");
        }
        System.out.println("The resultant array is as follows:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
