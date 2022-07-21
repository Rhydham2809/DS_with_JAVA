import java.util.Scanner;

public class Circular_Queue
{
    static Circular_Queue c1  = new Circular_Queue();
    static int front=-1,rear=-1,empty=0,temp_rare=0,count_front=0;
    static int Q[] = new int[6];

    public void cqInsert(int n)
    {
        if(front==-1)
        {
            front++;
            rear++;
            Q[rear]=n;
//            System.out.println("front=-1 "+front);
        }

        else if(rear==5)
        {
            if(front!=0)
            {
                if(rear!=front)
                {
                    if(temp_rare<front)
                    {
                        Q[temp_rare] = n;
                        temp_rare++;
//                        System.out.println("rear!=front "+temp_rare);
                    }

                    else if(temp_rare==front)
                    {
                        System.out.println("The circular queue is full \n CANNOT ENTER MORE ELEMENTS");
//                        System.out.println("temp_rare = "+temp_rare);
//                        System.out.println("rear1==front "+rear);
//                        System.out.println("rear==front1 "+front);
                    }

                }
                else if(rear==front)
                {
                    System.out.println("The circular queue is full \n CANNOT ENTER MORE ELEMENTS");
//                    System.out.println("rear1==front "+rear);
//                    System.out.println("rear==front1 "+front);
                }
            }
            else
            {
                System.out.println("The circular queue is full \n CANNOT ENTER MORE ELEMENTS");
//                System.out.println(front);
//                System.out.println(rear);
            }
        }

        else
        {
            rear++;
            Q[rear] = n;
//            System.out.println("else condition front = "+front);
//            System.out.println("else condition rear = "+rear);
        }
    }

    public int cqDelete()
    {
        if(front==-1)
        {
            System.out.println("Queue underflow");
            return -1;
        }

        else if(temp_rare!=0)
        {
           if(front<5)
           {
               if(count_front!=1)
               {
                   int temp = Q[front];
                   front++;
                   System.out.println("When front<5 "+Q[front]+" front value = "+front+" rear value = "+rear+" and temp_rare = "+temp_rare);
                   return temp;
               }

               else if(temp_rare>front)
               {
//                   System.out.println("When  temp_rare==front "+Q[front]+" front value = "+front+" rear value = "+rear +" and temp_rare = "+temp_rare);
                   int temp = Q[front];
                   front++;
//                   System.out.println("When  temp_rare==front "+Q[front]+" front value = "+front+" rear value = "+rear +" and temp_rare = "+temp_rare);
                   return temp;
               }
               else
               {
                   return 28;
               }
           }

           else if(front==5)
           {
//               System.out.println("When front=5 "+Q[front]+" front value = "+front+" rear value = "+rear + " and temp_rare = "+temp_rare);
               int temp = Q[front];
               front = 0;
               count_front =1;
//               System.out.println("When front=5 "+Q[front]+" front value = "+front+" rear value = "+rear + " and temp_rare = "+temp_rare);
               return temp;
           }


        }

        else if(front==rear)
        {
            if(front!=0 && rear!=0)
            {
                System.out.println("This is last element \n Now no CQdeletation can be done");
                empty=1;
                return Q[front];
            }
        }

        else
        {
            int temp = Q[front];
            front++;
//            System.out.println("Simple dequeue = "+" front value = "+front+" rear value = "+rear +" and temp_rare = "+temp_rare);
            return temp;
        }

            return 0;
    }

    public void display()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Empty queue");
        }
       else if(temp_rare!=0)
        {
            for(int i=0;i<front;i++)
            {
                System.out.print(Q[i]);
                System.out.println("");
            }
            for(int i=front;i<6;i++)
            {
                System.out.print(Q[i]);
                System.out.println("");
            }

        }
        else
        {
            for(int i=front;i<=rear;i++)
            {
//                System.out.println(front);
//                System.out.println(rear);
                System.out.print(Q[i]);
                System.out.println("");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("(The size of following queue is supposed to be 6)\nPlease enter the assigned number for the following functions:");
        int m = 5,n;

        while(m!=4)
        {
            System.out.println("1.CQinsert   2.CQdelete   3.Display  4.Quit");
            m = input.nextInt();

            if(m==1)
            {
                System.out.println("Please enter the element: ");
                n = input.nextInt();
                c1.cqInsert(n);
            }

            else if(m==2)
            {
                if(empty==0)
                {

                    int  r = c1.cqDelete();
                    if(r==28)
                    {
                        System.out.println("EMPTY QUEUE");
                        front=-1;
                        rear = -1;
                        temp_rare=0;
                    }
                    else
                    System.out.println("The cqdeleted elment is: "+r);
                }
                else
                {
                    System.out.println("EMPTY QUEUE");
                    front=-1;
                    rear = -1;
                    temp_rare=0;
                }

            }

            else if(m==3)
            {
                c1.display();
                System.out.println("");
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
