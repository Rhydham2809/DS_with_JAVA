import java.util.*;

public class stackloop
{
    static Scanner input = new Scanner(System.in);
    static  int n;
    public boolean isEmpty()
    {
        if(n!=-1)
            return false;
        else
            return true;
    }

    public void stack_push(Stack<Integer> stack)
    {
        System.out.println("Please enter the element: ");
        int m = input.nextInt();
        stack.push(m);
        n++;
    }

    public void stack_pop(Stack<Integer> stack)
    {
        if(n==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Original Stack: ");
            System.out.println(stack);
            for(int i=0;i<n;i++)
            {
                    Integer y = (Integer) stack.pop();
                    System.out.println(y);
            }
            System.out.println("Modified Stack: ");
            System.out.println(stack);
        }
    }

    public void stack_peep(Stack<Integer> stack)
    {
        try
        {
            if(n==-1 || n==0)
            {
                System.out.println("Stack is empty");
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

            Integer y = (Integer) stack.peek();
            System.out.println("The top element is : "+y);


    }

    public void stack_display(Stack<Integer> stack)
    {
        System.out.println("Current stack is as follows: "+stack);
    }


    public static void main(String[] args)
    {
        stackloop s1 = new stackloop();
        Stack<Integer> Stack  = new Stack<Integer>();
        System.out.println("Press the following buttons for following methods: \n 1.PUSH  2.POP  3.PEEP  4.DISPLAY  5.QUIT");
        System.out.println("The chiose is: ");
        int a = input.nextInt();
        while(a!=5)
        {


            if(a==1)
            {
                s1.stack_push(Stack);
            }
            if(a==2)
            {
                s1.stack_pop(Stack);
            }
            if(a==3)
            {
                s1.stack_peep(Stack);
            }
            if(a==4)
            {
                s1.stack_display(Stack);
            }

            System.out.println("The chiose is: ");
            a = input.nextInt();

        }
        if(a==5)
        {
            s1.stack_display(Stack);
            System.out.println("Thank you");
        }

    }
}