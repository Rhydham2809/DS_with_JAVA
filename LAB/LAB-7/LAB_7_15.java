import java.util.Scanner;

public class QueueMthods
{
    static QueueMthods q = new QueueMthods();
    static  Scanner input = new Scanner(System.in);
    static int front=-1,rear=-1,n;
    int  Q[] = new int[6];

    public void enQue()
    {
        System.out.print("Please enter the element: ");
        n = input.nextInt();

        if(rear == -1)
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
        if(rear<Q.length)
        {
            for(int i=0;i<front;i++)
            {
//                if(Q[i]!="")
            }
        }
    }

    public void deQue()
    {
        if(front==rear)
        {
            System.out.println("The queue is empty");
        }

        else if(front<0 || rear <0)
        {
            System.out.println("End of Queue");
        }

        else
        {
            System.out.println(Q[front]);
            front++;
        }
    }

    public void display()
    {
        System.out.println("The current updated queue is as follows: ");

        for(int i=front;i<=rear;i++)
        {
            System.out.println(Q[i]);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Press the following buttons for the given methods: \n 1.EnQue  2. Deque 3.Display 4.quit");
        int  m =5;

       while(m!=4)
       {

           System.out.println("1.EnQue  2. Deque 3.Display 4.quit");
           m = input.nextInt();

           if(m==1)
           {
               q.enQue();
           }

           else if(m==2)
           {
               q.deQue();
           }

           else if(m==3)
           {
               q.display();
           }
       }
       if(m==4)
       {
           System.out.println("Thank you");
       }

    }
}
