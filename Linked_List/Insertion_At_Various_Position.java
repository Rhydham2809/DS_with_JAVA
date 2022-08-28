import java.util.Scanner;

public class Insertion_At_Various_Position
{
    static Node head,tail;

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

    public void insert_Last(int a)
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

    public void insert_First(int a)
    {
        Node node = new Node(a);

        if(head==null)
        {
            head = node;
        }
        else
        {
            node.next = head;
            head = node;
        }
    }

    public void insert_random(int a,int findval)
    {
        Node find = head;
        Node node = new Node(a);

        if(head.val == findval)
        {
            node.next=head;
            head = node;
        }
        else
        {
            if(find.next!=null) {
                while (find.next.val != findval) {
                    find = find.next;
                    if(find.next==null) {
                        break;
                    }
                }
            }

            if(find.next==null){
                System.out.println("Number not found");
            }
            else
            {
                node.next = find.next;
                find.next = node;
            }

        }
    }

    public void display()
    {
        Node display_purpose = head;

        while(display_purpose!=null)
        {
            System.out.println(display_purpose.val);
           display_purpose = display_purpose.next;
        }
    }
    public static void main(String[] args)
    {
        Insertion_At_Various_Position n = new Insertion_At_Various_Position();

//       INSERTING AT LAST
        n.insert_Last(0);
        n.insert_Last(1);
        n.insert_Last(2);
        n.insert_Last(3);
        n.insert_Last(4);

//        INSERTING AT FIRST
        n.insert_First(13);
        n.insert_First(12);
        n.insert_First(11);

//        INSERTING AT RANDOM PLACES
        n.insert_random(28,4);
        n.insert_random(24 ,12);
        n.insert_random(28 ,60);
        n.display();
    }
}
