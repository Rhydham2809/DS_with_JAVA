import java.util.Scanner;

public class Simple_Queue_using_LinkedList
{
    static Node first,rear,display_purpose;
    static int size=0;
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

    public void enque(int a)
    {
        Node node = new Node(a);

        if(first==null)
        {
            first = node;
            rear = node;
            size++;
        }
        else
        {
            rear.next = node;
            rear = node;
            size++;
//            System.out.println(rear.val);
        }
    }

    public int deque()
    {
        if(first==null)
        {
            System.out.println("Queue is empty");
            return 0;
        }
        int a = 0;

//        if(a!=rear.val)
        {
            int r = first.val;
            first = first.next;
            return r;
        }
//        return 0;
//
    }

    public void display()
    {
        display_purpose = first;
        if(first==null)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            while(display_purpose!=rear)
            {
                System.out.println(display_purpose.val);
                display_purpose = display_purpose.next;
            }
            if(display_purpose==rear)
            {
                System.out.print(display_purpose.val);
            }
        }

    }


    public static void main(String[] args)
    {
        Simple_Queue_using_LinkedList q = new Simple_Queue_using_LinkedList();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements that are to be inputed in queue: ");
        int inputSize = input.nextInt();
        System.out.println("Please enter following number for functions:");
        int m = 5,count = 1;

        while(m!=4)
        {
            System.out.println("1.enque   2.deque  3.DISPLAY  4.QUIT");
            m = input.nextInt();

            if(m==1)
            {
                if(size+1<=inputSize)
                {
                    System.out.println("Please enter element "+(count)+": ");
                    count++;
                    int t = input.nextInt();
                    q.enque(t);
                }
                else
                {
                    System.out.println("Queue overflow");
                }

            }

            else if(m==2)
            {
                int r = q.deque();
                System.out.println("Successfully deleted "+r);
                if(r==0)
                {
                    first = null;
                    rear = null;
                    size = 0;
                }
            }

            else if(m==3)
            {
                q.display();
            }

            else if(m!=4)
            {
                System.out.println("Please evolute your choice");
            }
        }
        if(m==4)
        {
            System.out.println("Thanks");
        }

    }

}
