import java.util.Scanner;

public class Circular_LinkedList
{
    static Node head,tail,display_purpose;
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
            tail.next = head;
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
            System.out.println(display_purpose.val);
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Circular_LinkedList c = new Circular_LinkedList();

        c.insertLast(1);
        c.insertLast(2);
        c.insertLast(3);
        c.insertLast(4);
        c.insertLast(4);
        c.insertLast(43);
        c.insertLast(13);
        c.insertLast(9);

        System.out.print("The linkedList is as follows: ");
        c.display();

        System.out.println("Tail's value = "+tail.val);
        System.out.println("Head value using tail = "+tail.next.val);
        System.out.println("Head value = "+head.val);
    }

}
