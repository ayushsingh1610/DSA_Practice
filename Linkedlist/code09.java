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
            head = new Node(11 - i,head);
        }

        Display(head);
        Display(Reverse(head));
    }
    public static Node Reverse(Node head)
    {
        Node prev = null;       //Create a Null node
        Node temp = head;       //Create a temp node for traversal
        while(temp!=null)   
        {
            Node front = temp.next;         //This will store the reference of next node

            temp.next = prev;               //This will point the next reference to the previous node.

            prev = temp;                    //This will ensure that prev is now update to temp's place

            temp = front;                   //This will update the temp to next node. 
            
        }
        return prev;
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