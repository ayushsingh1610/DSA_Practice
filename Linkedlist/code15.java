// Remove duplicate elements from sorted linked list
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

class code15
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		head = new Node(1,head);
		head = new Node(2,head);
		head = new Node(5,head);
		head = new Node(11,head);
		head = new Node(2,head);
		head = new Node(22,head);


		printLL(head);

		head = removeduplicate(head);

		printLL(head);

	}
	public static Node removeduplicate(Node head)
	{
		Node n = head;
		Node prev = null;
		ArrayList<Integer> a = new ArrayList<>();
		while(n.next!=null && n!=null)
		{
			
			if(a.contains(n.data))
			{
				prev.next = n.next;				//if the duplicate is found the move the previous pointer to next node
			}
			else 
			{
				// Otherwise add the element and make the previous node current node.
				a.add(n.data);
				prev = n;
			}
			
			n = n.next;
		}
		System.out.println(a);

		return head;
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