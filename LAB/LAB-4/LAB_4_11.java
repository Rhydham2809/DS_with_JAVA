import java.util.Scanner;

public class LAB_4_11
{
    static int top = -1, aa=0,b=0,c=0;
    int i=0;
    public void push(String a,char ch[])
    {
        top++;
        ch[i]= a.charAt(top);
        i++;
    }

    public void pop(char ch[])
    {

        if(ch[top]=='a')
        {
            aa++;
        }
        else if(ch[top]=='b')
        {
            b++;
        }
        else
        {
            c++;
        }

        top--;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the string: ");
        String a = input.next();

        char ch[] = new char[a.length()];

        LAB_4_11 p = new LAB_4_11();

        for(int i=0;i<a.length();i++)
        {
            p.push(a,ch);
        }

        for(int i=0;i<a.length();i++)
        {
            p.pop(ch);
        }
        if(aa==b && c==0)
        {
            System.out.println("VALID STRING");
        }
        else
        {
            System.out.println("NON VALID STRING");
        }
    }
}
