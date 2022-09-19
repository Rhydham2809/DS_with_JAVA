import java.util.Scanner;

public class Polish
{
    static  Scanner input = new Scanner(System.in);
    static int n;
    static char stack[] = new char[n];
    String polish="";
    static int G_S_T=0,I_S_T=0;


    public  void G_S_T(char g_value)
    {
        if(g_value == '+' || g_value == '-')
        {
            G_S_T = 2;
        }
        else if (g_value == '*' || g_value == '/')
        {
            G_S_T = 4;
        }
        else if(g_value == '^')
        {
            G_S_T = 5;
        }
        else if(g_value=='(')
        {
            G_S_T = 0;
        }
        else if(g_value==')')
        {
            G_S_T = 0;
        }
        else
        {
            G_S_T = 8;
        }

    }

    public  void I_S_T(char next_value)
    {
        if(next_value == '+' || next_value == '-')
        {
            I_S_T = 1;
        }
        else if (next_value == '*' || next_value == '/')
        {
            I_S_T = 3;
        }
        else if(next_value == '^')
        {
            I_S_T =6;
        }
        else if(next_value=='(')
        {
            I_S_T = 9;
        }
        else if(next_value==')')
        {
            I_S_T = 0;
        }
        else
        {
            I_S_T = 7;
        }

    }
    public void push(char a)
    {
        if(a=='+'|| a=='-'||a=='/'||a=='*')
        {
            
        }
        else
        {
            polish += a;
//            System.out.println(polish);
        }
    }


    public static void main(String[] args)
    {
            System.out.print("Please enter the equation: ");
            String eq = input.next();
            Polish p1 = new Polish();
            n = eq.length();
            for(int i=0;i<eq.length();i++)
            {
                p1.push(eq.charAt(i));
            }
    }
}
