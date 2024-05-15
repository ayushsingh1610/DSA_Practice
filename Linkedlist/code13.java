// Delete last occurrence of an item from linked list
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
class code13
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = new Node();
		for (int i=1;i<=10 ;i++ ) {
			append(head,i);
		}
		printLL(head);
		System.out.print("Enter the data to be remove = ");
		int data = sc.nextInt();

		head = deletelastoccur(head,data);
		printLL(head);
	}

	public static Node deletelastoccur(Node head, int data)
	{
		head = rotateLL(head);
		Node n = head;

		while(n.next!=null)
		{
			if(n.next.data == data)
			{
				n.next = n.next.next;
			}
			n = n.next;
		}

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