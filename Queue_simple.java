import java.util.Scanner;
public class Queue_simple
{
    static Queue_simple s1 = new Queue_simple();
    static int Q[] = new int[6];
    static int front=-1,rear=-1;

    public void enQueue(int n)
    {
            if(rear==5)
            {
                System.out.println("Queue if full \n Cannot enter more elements");
            }

        if(front==-1)
        {
            front++;
            rear++;
            Q[rear] = n;
        }

        else
        {
            rear++;
            Q[rear] = n;
        }
    }

    public int deQueue()
    {
        if(front==-1)
        {
            System.out.println("Queue underflow");
            return -1;
        }
        else if(front==rear)
        {
            System.out.println("Last element of Queue");
            int temp = Q[front];
            front++;
            return temp;
        }
        else
        {
            int temp = Q[front];
            front++;
            return temp;
        }
    }

    public void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(Q[i]+" ");
            System.out.print("");
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("(The size of following queue is supposed to be 6)\nPlease enter the assigned number for the following functions:");
        int m = 5,n;

        while(m!=4)
        {
            System.out.println("1.Enqueue   2.Dequeue   3.Display  4.Quit");
            m = input.nextInt();

            if(m==1)
            {
                System.out.print("Please enter element: ");
                n = input.nextInt();
                s1.enQueue(n);
            }

            else if(m==2)
            {
                int r = s1.deQueue();
                System.out.println("Dequeued element = "+r);
            }

            else if(m==3)
            {
                System.out.println("The updated queue is as follows:");
                s1.display();
            }

            else if(m!=4)
            {
                System.out.println("Please re-evolute the inserted choice");
            }
        }

        if(m==4)
        {
            System.out.println("Thank you");
        }
    }
}

