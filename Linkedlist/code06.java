// Delete the kth element of the LL
import java.util.*;
class node 
{
    int data;
    node next;

    node(int data, node next)
    {
        this.data = data;
        this.next = next;
    }
}
class code06
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node head = null;
        for(int i=1;i<=5;i++)
        {
            head = new node(6-i, head);
        }

        System.out.print("Enter the k-th node = ");
        int k = sc.nextInt();

        System.out.println("Before Deletion = ");
        Display(head);
        head = delete_kth(head, k);

        System.out.println("\nAfter Deletion = ");
        Display(head);
    }
    public static node delete_kth(node head, int k)
    {
        int c=0;
        node n = head;
        node prev = null;
        //By kth(indexwise)
        while(n!=null)
        {
            c++;
            if(c == k)
            {
                prev.next = prev.next.next;
                prev = null;
                break;
            }

            prev = n;
            n = n.next;
        }

        return head;
    }

    public static node Display(node head)
    {
        node n = head;
        while(n!=null)
        {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("null");
        return n;
    }
}