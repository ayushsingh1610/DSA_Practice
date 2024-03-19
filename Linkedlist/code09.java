// Reverse a Linked List
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
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class code09
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        for (int i=1;i<=10 ;i++ ) {
            head = new Node(11 - i,head);
        }
        System.out.println("1 for Stack method\n2 for Changing the refernce\n3 for Recursion");
        System.out.print("Enter your choice = ");
        int n = sc.nextInt();

        System.out.println("This is the Original LL = ");
        Display(head);
        System.out.println();
        switch(n)
        {
        case 1:
            {
                System.out.println("By Stack method = ");
                Display(Reversal_Stack(head));
                break;
            }
        case 2:
            {
                System.out.println("By changing the reference = ");
                Display(Reverse(head));
                break;
            }
        case 3:
            {
                System.out.println("\nBy Recursion = ");
                Display(Reversal_Recursion(head));
                break;
            }
        default:
            {
                System.out.println("Invalid choice");
            }
        }
    }
    public static Node Reversal_Stack(Node head)
    {
        Node n = head;
        Node temp = head;
        Stack<Integer> s = new Stack<>();
        while(n!=null)
        {
            s.push(n.data);
            n = n.next;
        }
        while(temp!=null)
        {
            temp.data = s.pop();
            temp = temp.next;
        }
        return head;
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

    public static Node Reversal_Recursion(Node head)
    {
        
        if(head==null || head.next==null)
        {
            return head;
        }
        

        Node newhead = Reversal_Recursion(head.next);           //This will pass the following LL
        Node front = head.next;                                 //This will store the next element to the head
        front.next = head;                                      //This will points the front's next to the head so we can reverse it
        head.next = null;                                       //This will points the head to null

        return newhead;
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