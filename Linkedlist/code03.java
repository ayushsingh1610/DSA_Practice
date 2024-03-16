// Print the Length of LinkedList
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
class code03
{
    public static void main(String[] args) {
        node n = null;

        for (int i = 1; i <= 10; i++) {
            n = new node(11-i, n);
        }

        System.out.println("\nLength of LinkedList is = " + length(n) + "\n");
        // Display(n);

    }

    public static int length(node head)
    {
        node n = head;
        int count = 0;
        while(n!=null)
        {
            count+=1;
            n = n.next;
        }

        return count;
    }

    public static node Display(node head)
    {
        node n = head;
        while(n!=null)
        {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print("null");
        return n;
    }
}