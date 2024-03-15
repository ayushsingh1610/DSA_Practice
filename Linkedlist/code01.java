// Print the Stored element in LinkedList.
// import java.util.*;
class Node
{
    int data;
    Node next;

    //Constructor for storing the data and next pointer.
    // This is used when you want to store the data and next value(Not NULL)
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }

    //This is used when we store last value.
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class code01
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        Node n = null;
        n = new Node(2, n);
        n = new Node(3, n);
        n = new Node(5, n);
        n = new Node(6, n);
        

        Display(n);
    }

    //Creating a List here
    static Node InsertFirst(int data, Node head)
    {
        
        Node newnode = new Node(data);                      // This will create a new node which adds the initial data as "data" and 'next' as "null"

        newnode.next = head;                                //The next pointer is now initialized with the previous node's data        
        head = newnode;                                     // Now the "newnode" is our new "head" because we insert from starting

        return head;                                        //This will return the newly created node as head
    }
    //This is the way to display the LinkedList
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
}