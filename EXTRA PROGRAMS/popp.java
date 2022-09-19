import java.util.Scanner;

public class popp
{
    static int top;
    public int pop(int arr[])
    {
        if(top>0)
        {
            top--;
        }
        return (arr[top]);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of an array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+(1+i));
            arr[i] = input.nextInt();
        }
        top=n;
        popp p1 = new popp();
        for(int i=0;i<n;i++)
        {
            System.out.println(p1.pop(arr));
        }

    }
}
