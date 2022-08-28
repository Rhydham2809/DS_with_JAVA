import java.util.Scanner;

public class Delete_In_Order
{
    static Node head,tail,delete_purpose,getDelete_purpose2;

    class Node
    {
        int val;
        Node previous;
        Node next;

        Node(int a)
        {
            val = a;
            previous = null;
            next = null;
        }
    }

    public void insert(int a)
    {
        Node node = new Node(a);

        if(head==null)
        {
            head = node;
            tail = node;
        }
        else
        {
            node.previous = tail;
            tail.next = node;
            tail = node;
            head.previous = tail;
            node.next = head;
        }
    }

    public void delete(int n) {
        if (n != 0)
        {
            int count = 1;

            delete_purpose = head;
            getDelete_purpose2 = head;

            while(delete_purpose!=tail)
            {
                delete_purpose = delete_purpose.next;
                count++;
            }
            if(head == tail && head!=null)
            {
                System.out.println(delete_purpose.val);
                delete_purpose.next = null;
                delete_purpose.previous = null;
            }
            else if(count==1)
            {
                System.out.println("The linked list is empty");
            }
            else
            {
                while(head!=tail)
                {
                    for(int i=1;i<=n;i++)
                    {
                        if(i==n)
                        {
                            System.out.println(getDelete_purpose2.val);
                            if(getDelete_purpose2==tail)
                            {
                                tail = tail.previous;
                                tail.next = head;
                                head.previous = tail;
                                getDelete_purpose2 = head;
                            }
                            else if(getDelete_purpose2 == head)
                            {
                                head.next.previous = tail;
                                head = head.next;
                                tail.next = head;
                                getDelete_purpose2 = head;
                            }
                            else
                            {
                                getDelete_purpose2.previous.next = getDelete_purpose2.next;
                                getDelete_purpose2.next.previous = getDelete_purpose2.previous;
                                getDelete_purpose2 = getDelete_purpose2.next;
                            }
//                       System.out.println("getDelete_purpose2 = "+getDelete_purpose2.val);
                        }

                        else
                        {
                            getDelete_purpose2 = getDelete_purpose2.next;
                        }
                    }
                }
                if(head==tail)
                {
                    System.out.println(getDelete_purpose2.val);
                    getDelete_purpose2.previous = null;
                    getDelete_purpose2.next = null;
                }
            }
        }

        else
        {
            System.out.println("Please enter the valid number");
        }

    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Delete_In_Order d = new Delete_In_Order();

        System.out.print("Please enter the number of linkedlist node : ");
        int m = input.nextInt();

        for(int i=1;i<=m;i++)
        {
            System.out.print("Enter element "+i+" : ");
            int a = input.nextInt();
            d.insert(a);
        }

        System.out.print("Please enter the pattern : ");
        int e = input.nextInt();
        System.out.println("THE SEQUANCE IN WHICH NODES ARE DELETED");
        d.delete(e);

//        System.out.println("Head value = "+head.val);
//        System.out.println("Tail value = "+tail.val);
//        System.out.println("Head value = "+tail.next.val);
    }
}