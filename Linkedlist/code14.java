// Delete middle of linked list
import java.util.*;
class Node
{
	int data;
	Node next;

	Node()
	{
		this.next = null;
	}
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
class code14
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Node head = new Node(1);
		for (int i=2;i<11;i++ ) {
			append(head,i);
		}
		System.out.println("Before Deletion: ");
		printLL(head);
		// head = deletemiddle(head);
		head = deletemiddleNode(head);
		System.out.println("\nAfter Deletion: ");
		printLL(head);
	}

	//Optimal approach
	public static Node deletemiddleNode(Node head)
	{
		if(head==null || head.next == null)
		{
			return head;
		}
		Node fast = head.next.next;			//The logic is to skip 1 step of slow and move fast 1 step ahead.
		Node slow = head;

		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		slow.next = slow.next.next;

		return head;
	}

	public static Node deletemiddle(Node head)
	{
		if(head==null || head.next == null)
		{
			System.out.print("Node does not have middle element");
			return head;
		}

		int len = length(head);
		int count = len/2;
		Node n = head;
		while(n.next!=null)
		{
			count--;
			if(count==0)
			{
				n.next = n.next.next;
			}
			n = n.next;
		}
		return head;
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

	public static void append(Node head, int data)
	{
		Node n = head;

		if(head == null)
		{
			System.out.print("Head cannot be null");
			return;
		}
		Node temp = new Node(data);

		while(n.next!=null)
		{
			n = n.next ;
		}
		n.next = temp;
		temp.next = null;

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