import java.util.Scanner;
public class Stack_using_LinkedList
{
    static Node TOP,Display,one;
    static int size,inputSize;
    static class Node
    {
        int val;
        Node next;

        Node(int val)
        {

                this.val = val;
                this.next = null;

        }
    }

    public void push(int a)
    {
        Node node = new Node(a);

            if(TOP==null)
            {
                TOP=node;
                one = TOP;
                size++;
            }
            else
            {
                node.next = TOP;
                TOP = node;
                size++;
            }

    }

    public int pop()
    {
        if(TOP==null)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
        {
            int r = TOP.val;
            TOP = TOP.next;
            size--;
            return r;

        }
    }

    public void display()
    {
       Display = TOP;
//        System.out.println(TOP.val);
        if(TOP==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            while(Display!=one)
            {
                System.out.println(Display.val);
                Display = Display.next;
            }
            System.out.println(one.val);
        }

    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        Stack_using_LinkedList s = new Stack_using_LinkedList();
        System.out.print("Please enter the number of elements that are to be inputed in stack: ");
        inputSize = input.nextInt();
        System.out.println("Please enter following number for functions:");
        int m = 5;

        while(m!=4)
        {
            System.out.println("1.PUSH   2.POP  3.DISPLAY  4.QUIT");
            m = input.nextInt();

            if(m==1)
            {
                if(size+1<=inputSize)
                {
                    System.out.println("Please enter element "+(size)+": ");
                    int t = input.nextInt();
                    s.push(t);
                }
               else
                {
                    System.out.println("Stack Overflow");
                }
            }

            else if(m==2)
            {
                int r = s.pop();
                System.out.println("Successfully deleted "+r);
            }

            else if(m==3)
            {
                s.display();
            }
        }

    }
}
