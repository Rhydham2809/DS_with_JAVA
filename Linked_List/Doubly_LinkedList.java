
public class Doubly_LinkedList
{
    static Node head,tail,display_purpose;

    static class Node
    {
        int val;
        Node next;
        Node previous;

        Node(int a)
        {
            val      = a;
            next     = null;
            previous = null;
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
            tail.next = node;
            node.previous = tail;
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
            if(head.previous==null)
            {
                head.previous = node;
                node.next = head;
                head = node;
            }
        }

    }

    public void insertBetween(int a,int b)
    {
        Node node = new Node(b);
        Node find = head;

        while(find.next.val!=a)
        {
            find = find.next;
        }
            node.previous = find;
            node.next = find.next;
    }

    public void delete(int a)
    {
        Node find = head;
        int count=0;
        if(head.val==a)
        {
            head = head.next;
            head.previous = null;
            count=1;
        }
        else if(tail.val ==a)
        {
            tail = tail.previous;
            count=1;
        }
        else
        {
            if(find.next.val==a)
            {   count=1;
                find.next = find.next.next;
                find.next.previous = find;
            }
        }
        if(count==0)
        {
            System.out.println("Number not found");
        }
    }

    public void display()
    {
        display_purpose=tail;

        while(display_purpose.previous.previous!=null)
        {
            System.out.println(display_purpose.val);
            display_purpose = display_purpose.previous;
        }
        System.out.println(display_purpose.val);
        System.out.println(head.val);

    }

    public static void main(String[] args)
    {
        Doubly_LinkedList d = new Doubly_LinkedList();

//        d.insertFirst(-2);

        d.insert(0);
        d.insert(1);
        d.insert(2);
        d.insert(3);
        d.insert(4);
        d.insert(5);
        d.insert(6);
        d.insert(7);
        d.insert(8);
        d.insert(9);
        d.insert(10);
        d.insert(11);

        d.insertFirst(-1);
        d.insertFirst(-2);
        d.insertFirst(-3);

        d.insertBetween(8,18);

        d.delete(-2);
        d.delete(-1);
        d.delete(0);
        d.delete(1);
        d.delete(2);
        d.delete(11);
        d.delete(12);


        d.display();


    }
}
