import java.util.Stack;

public class Insert
{
    static  Node root;

    class Node
    {
        int val;
        Node left;
        Node right;

        Node(int a)
        {
            val = a;
            left = null;
            right = null;
        }
    }

    void insert(int a)
    {
        Node node = new Node(a);

        if(root==null)
        {
            root = node;
        }

        else
        {
            Node temp = root;

            while(temp.right!=null || temp.left != null)
            {
                if(node.val>=temp.val && temp.right!=null)
                {
                    temp = temp.right;
                }
                else if(node.val<temp.val && temp.left!=null)
                {
                    temp = temp.left;
                }
                else
                    break;
            }

            if(node.val>=temp.val)
            {
                temp.right = node;
            }
            else if(node.val<temp.val)
            {
                temp.left = node;
            }
        }
    }

    void inorder_format()
    {
        if(root==null)
        {
            System.out.println("Tree is empty");
        }
        else
        {
            Node temp=root;
            Stack<Node>  st = new Stack<>();

            while(temp!=null || st.size()>0)
            {
                while(temp!=null)
                {
                    st.push(temp);
                    temp = temp.left;
                }

                temp = st.pop();
                System.out.print(temp.val+" ");
                temp = temp.right;
            }
        }
    }

    void preorder_format()
    {
        if(root==null)
        {
            System.out.println("The tree is empty");
        }
        else
        {
            Stack<Node> st1 = new Stack<Node>();

            st1.push(root);

            while(st1.size()>0)
            {
                Node temp = st1.pop();
                System.out.print(temp.val+" ");

                if(temp.right!=null)
                {
                    st1.push(temp.right);
                }
                if(temp.left!=null)
                {
                    st1.push(temp.left);
                }

            }
        }
    }

    public void postOrder()
    {
        if(root==null)
        {
            System.out.println("The tree is empty");
        }
        else
        {
            Stack<Node> st1 = new Stack<>();
            Stack<Node> st2 = new Stack<>();

            st1.push(root);

            while(st1.size()>0)
            {
                Node temp = st1.pop();
                st2.push(temp);

                if(temp.left!=null)
                {
                    st1.push(temp.left);
                }
                if(temp.right!=null)
                {
                    st1.push(temp.right);
                }
            }

            while(st2.size()>0)
            {
                System.out.print(st2.pop().val+" ");
            }
        }
    }

    public void delete2(int a) {
        Node temp;
        if (root == null) {
            System.out.println("Tree is empty");
        } else {
            Node parent = null;
            temp = root;

            while (temp != null && temp.val != a)
            {
                parent = temp;
                if (a > temp.val) {
                    temp = temp.right;
                } else {
                    temp = temp.left;
                }
            }
            if (temp.left == null && temp.right == null) {
                if (parent.val < a) {
                    parent.right = null;
                } else {
                    parent.left = null;
                }
            }
            if (temp.left != null && temp.right == null) {
                temp = temp.left;
                if (temp.val < parent.val)
                    parent.left = temp;
            }
            if (temp.left == null && temp.right != null) {
                temp = temp.right;
                if (temp.val >= parent.val)
                    parent.right = temp;
            }
            if (temp.left != null && temp.right != null) {
                Node t = inderSuccessor(temp);
                temp.val = t.val;
            }
        }
    }

    Node inderSuccessor(Node temp)
    {
        boolean rchild = true;
        Node parent = temp;
        temp = temp.right;
        if(temp.left!=null)
        {
            rchild = false;
        }
        while(temp.left!=null)
        {
            parent = temp;
            temp = temp.left;
        }
        if(rchild)
        {
            parent.right = temp.right;
        }
        else
        {
            parent.left = temp.right;
        }
        return temp;
    }


    public static void main(String[] args)
    {
        Insert i = new Insert();

//        TREE 1

        i.insert(28);
        i.insert(2);
        i.insert(30);
        i.insert(1);
        i.insert(5);
        i.insert(4);
        i.insert(16);
        i.insert(27);
        i.insert(95);
        i.insert(96);

//        TREE 2

//        i.insert(867);
//        i.insert(290);
//        i.insert(35);
//        i.insert(7654);
//        i.insert(1);
//        i.insert(46);
//        i.insert(28);



        System.out.println("Tree in infix transverse:");
        i.inorder_format();
//
        System.out.println();
//
        System.out.println("Tree in preorder transverse:");
        i.preorder_format();

        System.out.println();

        System.out.println("Tree in postorder transverse:");
        i.postOrder();

//        i.delete2(2);
//        i.delete2(20);
//        i.delete2(12);
//        i.delete2(15);


//        System.out.println("Tree in infix transverse:");
//        i.inorder_format();q6
    }
}
