import java.util.Scanner;

public class Element
{
    static Scanner input = new Scanner(System.in);
    static int top=-1;
    public void push(int[] arr)
    {
        top++;
        System.out.println("Element "+(top+1));
        arr[top]=input.nextInt();
    }

    public int pop(int arr[],int b)
    {
        top--;
        if(arr[top]==b)
        {
            return 1;
        }
        else
            return 0;
    }

    public int recur(int arr[],int b)
    {
        int a;
        while(top!=0)
        {
            a=pop(arr,b);
            if(a==1)
            {
                return 1;

            }
            else {
                return recur(arr, b);
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        System.out.print("Please enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        Element e1 = new Element();
        for(int i=0;i<n;i++)
        {
            e1.push(arr);
        }
        System.out.print("Please enter the number: ");
        int b = input.nextInt();

        int d=e1.recur(arr,b);
        if(d==1)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("not found");
        }
    }
}
