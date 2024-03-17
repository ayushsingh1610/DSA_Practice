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

    }
    public static int middle_node(Node head)
    {
        Node n = head;
        int c=0;
        int middle = -1;
        if(n==null || n.next==null)
        {
            middle =  n.data;
        }
        while(n!=null)
        {
            c++;
            if(c == (lengthLL(head)/2)+1)
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
}