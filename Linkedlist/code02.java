// Deletion in Linked List
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
class code02
{
    public static void Display(Node n)
    {
        Node curr = n;                                      //"curr" starts with starting of linkedlist
        while(curr!=null)                                   //Until it finds "null"
        {
            System.out.print(curr.data + " --> ");
            curr = curr.next;                               //Here the curr in now updated with its next value. 
        }
        System.out.print("null");
    }
    static Node InsertFirst(int data, Node head)
    {
        
        Node newnode = new Node(data);                      // This will create a new node which adds the initial data as "data" and 'next' as "null"

        newnode.next = head;                                //The next pointer is now initialized with the previous node's data        
        head = newnode;                                     // Now the "newnode" is our new "head" because we insert from starting

        return head;                                        //This will return the newly created node as head
    }

    //This is Used for Deletion
    public static Node deleteLast(Node head)
    {
        if(head==null || head.next==null)                   //This is used when we have a empty linkedlist or only single node
        return null;

        Node temp = head;                                   //Create a temporary node

        while(temp.next.next != null)                       //traverse until we reach the second last node
        {
            temp = temp.next;                               //update the node with next
        }
        temp.next = null;                                   //now update the 2nd last's node next pointer to null

        return temp;
        
    }
    public static void main(String[] args) {
        Node n = null;
        n = new Node(1, n);
        n = new Node(2, n);
        n = new Node(3, n);
        n = new Node(4, n);
        n = new Node(5, n);
        n = new Node(6, n);
        n = new Node(8, n);

        System.out.println("List Before deletion = ");
        Display(n);

        int l = 3;
        for (int i = 0; i <l; i++) {
            deleteLast(n);
        }
        System.out.println("\n\nList After Deletion = ");
        Display(n);

    }
}