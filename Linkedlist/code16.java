// Add 2 List in LinkedList
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

class code16
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head1 = null;
		Node head2 = null;

		for(int i=0;i<4;i++)
		{
			head1 = new Node(2*i,head1);
			head2 = new Node(i+1,head2);
		}

		printLL(head1);
		printLL(head2);
		printLL(SumTwoLL(head1,head2));
	}

	public static Node SumTwoLL(Node head1, Node head2)
	{
		Node n1 = head1;
		Node n2 = head2;
		Node sumnode = null;

		while(n1!= null || n2!= null)
		{

			int d = n1.data + n2.data;
			// System.out.println(d);
			sumnode = new Node(d,sumnode);
			n1 = n1.next;
			n2 = n2.next;
		}
		return sumnode;

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