import java.util.Scanner;

public class singly_LinkedList
{
    static Node head = null;
    static Node tail = null;
    static Node display_purpose;
    static Node findval;
    static Node find;
    static int  count=0;
    static class Node

    {
        int val;
        Node next;

        Node(int a)
        {
            val = a;
            next = null;
        }

    }
    public void insertLast(int a)
    {
        Node node = new Node(a);
        if(head==null)
        {
            head = node;
            tail = node;
        }

        else
        {
                tail.next = node;
                tail = node;
        }

    }

    public void insertFirst(int a)
    {
        Node node = new Node(a);
        if(head==null)
        {
            head = node;
            tail = node;
        }

        else
        {
            node.next = head;
            head = node;
        }
    }

    public void delete(int a)
    {

        if(head.val==a)
        {
//            System.out.println(head.val);

            head = head.next;
//            System.out.println(head.val);
            find = head;
//            System.out.println(find.val);
        }

        else
        {
            find = head;
            while(find.next.val!=a)
            {
                System.out.println(a);
                System.out.println(find.next.val);
                find = find.next;

                if(find.next==tail && find.next.val!=a && tail.next!=null)
                {
                    System.out.println("");
                    System.out.println("THE INPUTED VALUE DOES NOT EXSIT");
                    count =1;
                    break;
                }
                if(tail.next==null){

                };
            }

            if(count==0)
            {
                System.out.println("hi2");
                find.next = find.next.next;
                find = find.next.next;
            }
        }
      }


    public void orderedLinkedList(int find,int replace)
    {
        findval = head;

        int count=0;

        while(findval.val!=find)
        {
            findval = findval.next;
            if(findval.val==tail.val)
            {
                if(findval.val != find)
                {
                    System.out.println("Sorry the element is not is in the linked list.");
                    count = 1;
                }
            }
        }

        if(count!=1)
        {

            Node node = new Node(replace);
            node.next = findval;

        }

    }

    public void display()
    {
        display_purpose = head;

        while(display_purpose!=tail)
        {
            System.out.print(display_purpose.val);
            display_purpose = display_purpose.next;
        }
        if(display_purpose==tail)
        {
            System.out.print(display_purpose.val);
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        singly_LinkedList list = new singly_LinkedList();

        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(9);

        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);

        list.display();
        list.delete(0);
        list.delete(4);
        list.delete(8);
        list.delete(9);
        list.delete(90);
        System.out.println("");
        list.display();
    }
}
