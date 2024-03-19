// Detect Loop in linked list
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
class code10
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		for (int i=1;i<=10 ;i++ ) {
			head = new Node(11-i,head);
		}

		System.out.println("1 for using map method\n2 for using tortoise and hare.\n");
		System.out.print("Enter the choice = ");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
			{
				if(detect_loop1(head))
					System.out.print("Loop Exists\n");

				else 
					System.out.println("Loop Not Exists");

				break;
			}
		case 2:
			{
				if(detect_loop2(head))
					System.out.print("Loop Exists\n");

				else 
					System.out.println("Loop Not Exists");


				break;
			}
		default:
			{
				System.out.println("Invalid choice.");
			}
		}
	}
	public static boolean detect_loop1(Node head)
	{
		Node n = head;
		Map<Node, Integer> nmap = new HashMap<>();

		while(n!=null)
		{
			if(nmap.containsKey(n))						//If node is already present in the map that means there is a loop.
			{
				return true;
			}

			nmap.put(n,1);
			n= n.next;
		}
		return false;
	}

	public static boolean detect_loop2(Node head)			//Algo of Tortoise and Hare
	{
		Node slow = head;
		Node fast = head;

		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;

			if(slow==fast)									//If slow and fast points at same node that's means loop exists.
				return true;
		}
		return false;
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