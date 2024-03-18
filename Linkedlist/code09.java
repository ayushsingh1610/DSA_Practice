// Reverse a Linked List
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
class code09
{
    public static void main(String[] args) {
        Node head = null;
        for (int i=1;i<=10 ;i++ ) {
            head = new Node(i,head);
        }

        Display(Reverse(head));
    }
    public static Node Reverse(Node head)
    {
        Node prev = null;
        Node temp = head;
        while(temp!=null)
        {
            Node front = temp.next;
            prev.next = temp;
            temp = temp.next; 
        }
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