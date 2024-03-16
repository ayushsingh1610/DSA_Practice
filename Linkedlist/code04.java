// Search an element in the LL
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
class code04
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node head = null;
        head = InsertFirst(head);
        System.out.print("Enter the element = ");
        int element = sc.nextInt();
        if(find(head, element)== -1)
        System.out.println("Element not found");

        else
        System.out.println("Element present at = " + find(head, element));

        // System.out.println("\n");
    }

    public static int find(node head, int element)
    {
        node n = head;
        int index = 0;
        while(n!=null)
        {
            if(n.data == element)
            {
                return index+1;
            }
            index++;
            n = n.next;
        }
        return -1;
    }

    public static node InsertFirst(node head)
    {
        node n = head;
        for (int i = 0; i < 10; i++) {
            n = new node(10-i, n);
        }
        return n ;
    }
}