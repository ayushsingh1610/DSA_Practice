// Insert at the tail of the LL
import java.util.*;
class Node
{
    int data;
    Node next;

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
class code07
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node n = null;
        for(int i = 1;i<=10;i++)
        {
            n = new Node(11 - i,n);
        }
        System.out.print("Enter the data = ");
        int element = sc.nextInt();
        System.out.println("Before Insertion = ");
        Display(n);

        n = Insert_Tail(n, element);
        System.out.println("After Insertion = ");
        Display(n);
    }
    public static Node Insert_Tail(Node head, int element)
    {
        Node newnNode = new Node(element, null);
        Node n = head;                                          //Always create a temp node for traversal
        if(n==null || n.next==null)     return new Node(element, null);
        while(n.next!=null)
        {
            n = n.next;
        }
        n.next = newnNode;
        return head;
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