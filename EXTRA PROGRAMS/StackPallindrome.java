import java.util.Scanner;
import java.util.Stack;

public class StackPallindrome
{
    static  int top=-1;
    static Scanner input = new Scanner(System.in);
    char arr[] = new char[100];
    char s2;
    static String s3="";
    public void push(char a)
    {
        top++;
        arr[top] = a;
    }

    public void pop()
    {

        s2 = arr[top];
//        System.out.println(s2);
        s3 = s3+s2;
//        System.out.println(s3);
        top--;
    }

    public static void main(String[] args)
    {
        System.out.print("Please enter the string: ");
        String s = input.next();
        StackPallindrome s1 = new StackPallindrome();

        for(int i=0;i<s.length();i++)
        {
            s1.push(s.charAt(i));
        }

        for(int i=0;i<s.length();i++)
        {
            s1.pop();
        }

//        System.out.println(s3);
//        System.out.println(s);
        if(s.equals(s3))
        {
            System.out.println("Palindrome string");
        }
        else
        {
            System.out.println("NOT Palindrome string");
        }
    }
}
