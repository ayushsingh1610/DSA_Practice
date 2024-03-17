// Print the Middle of a given linked list
class Node
{
    int data;
    Node next;

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class code08
{
    public static void main(String[] args) {
        Node head = null;

        for(int i = 1;i<=10;i++)
        {
            head = new Node(11-i, head);
        }
        System.out.println("Middle of LL is = " + middle_node(head));

        System.out.println("Middle from = ");
        Display(middle(head));

        System.out.println("\nMiddle from by New Algo =  ");
        Display(Middle_Node(head));
    }

    public static Node middle(Node head)
    {
        Node n = head;
        int c=0;
        while(n!=null)
        {
            c++;
            if(c == (lengthLL(head)/2)+1)                   //check the middle element and break the traversal 
            {
                break;
            }
            n = n.next;
        }
        return n;                                          //return the LL from the point where traversal stops.
    }

    //Tortoise and Hare Algorithm
    public static Node Middle_Node(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(slow!=null)
        {
            if(fast == null || fast.next==null)
            {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static int middle_node(Node head)
    {
        Node n = head;
        int c=0;
        int middle = -1;

        //Return same element if there is only one element or none.
        if(n==null || n.next==null)
        {
            middle =  n.data;
        }
        while(n!=null)
        {
            c++;
            if(c == (lengthLL(head)/2)+1)                   //Check if the count is equal to middle
            {
                middle =  n.data;
            }
            n = n.next;
        }
        return middle;
    }
    private static int lengthLL(Node head)
    {
        Node n = head;
        int c=0;
        while(n!=null)
        {
            c++;
            n = n.next;
        }
        return c;
    }
    public static void Display(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}