import java.util.Scanner;

public class singly_Linked_List
{

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


    static Node head = null;
    static Node tail = null;
    static Node display_purpose;
    static Node findval;
    static int size=0;

    public void insertLast(int a)
    {
        Node node = new Node(a);
        size++;
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
        size++;
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
            System.out.println(display_purpose.val);
            display_purpose = display_purpose.next;
        }
        if(display_purpose==tail)
        {
            System.out.println(display_purpose.val);
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        singly_Linked_List list = new singly_Linked_List();

        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(10);


        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);


//        list.orderedLinkedList(8);



        list.display();
        System.out.println(size);


    }
}
