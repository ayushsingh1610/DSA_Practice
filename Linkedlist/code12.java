// Remove Nth node from end of linked list
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
class code12
{
	public static void main(String[] args) {
		Node head = null;
		head = new Node(5,head);
		head = new Node(4,head);
		head = new Node(3,head);
		head = new Node(2,head);
		head = new Node(1,head);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Nth node from end to remove(from 1 to 5) = ");
		int n = sc.nextInt();
		printLL(head);
		// head = rotateLL(head);
		// deleteNthNode(head,n);
		head = deleteNthnodeBy_2Pointer(head,n);
		printLL(head);
	}
	public static void deleteNthNode(Node head, int n)
	{
		Node temp = head;
		int count = 0;
		while(temp!=null)
		{
			count++;

			//So that we can ignore the Nth index and connect the previous's next to (N+1)th Node
			if(count == length(head)-n)
			{
				temp.next = temp.next.next;
			}
			temp = temp.next;

		}

	}
	/*	if you rotate the LL the this implies to you
	public static void deleteNthNode(Node head, int n)
	{
		Node temp = head;
		int count = 0;
		while(temp!=null)
		{
			count++;

			//So that we can ignore the Nth index and connect the previous's next to (N+1)th Node
			// if(count == (n-1))		
			{
				temp.next = temp.next.next;
			}
			temp = temp.next;

		}

	}*/

	public static Node deleteNthnodeBy_2Pointer(Node head, int n)
	{
		Node fast = head;
		Node slow = head;

		// If the nth node is last index from ending the we have to remove the 1st node from starting by changing head position
		if(n==length(head))
		{
			head = head.next;
			return head;
		}

		for(int i= 0; i<n;i++)
		{
			fast = fast.next;
		}
		while(fast.next!=null)
		{
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}
	public static Node rotateLL(Node head)
	{
		Node n = head;
		Node newnode = null;
		while(n!=null)
		{
			Node front = n.next;
			n.next = newnode;
			newnode = n;
			n = front;
		}
		return newnode;
	}
	public static int length(Node head)
    {
        Node n = head;
        int count = 0;
        while(n!=null)
        {
            count+=1;
            n = n.next;
        }

        return count;
    }

	public static void printLL(Node head)
	{
		Node n = head;

		while(n!=null)
		{
			System.out.print(n.data + " -> ");
			n=n.next;
		}
		System.out.print("null");
		System.out.println();

	}
}