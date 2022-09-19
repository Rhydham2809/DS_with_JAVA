import java.util.Scanner;
public class pushh
{
    public void push(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter size of array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+(1+i));
            arr[i] = input.nextInt();
        }
        pushh p = new pushh();
        p.push(arr);

    }
}
