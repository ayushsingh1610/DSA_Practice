// Rotate a linked list.
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
class code11
{
	public static void main(String[] args) {
		Node head = null;
		for(int i=1;i<11;i++)
		{
			head = new Node(11-i,head);
		}

		Node nnode = rotateLL(head);
		System.out.println("Before Rotating = ");
		printLL(head);

		System.out.println("\nAfter rotating = ");
		printLL(nnode);
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
	public static void printLL(Node head)
	{
		Node n = head;

		while(n!=null)
		{
			System.out.print(n.data + " -> ");
			n=n.next;
		}
		System.out.print("null");

	}
}