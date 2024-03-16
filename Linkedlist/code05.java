// Delete the head of the LL
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
class code05
{
    public static void main(String[] args) {
        node n = null;
        n = InsertFirst(n);
        System.out.println("Before Deletion = ");
        Display(n);
        n = deleteHead(n);
        System.out.println("\nAfter Deletion = ");
        Display(n);

    }
    public static node deleteHead(node head)
    {
        //This will create a empty node 
        node n = null;

        //This will initialize the newnode with 2nd node(Ignoring the head node)
        n = head.next;

        return n;
    }
    public static node InsertFirst(node head)
    {
        node n = head;
        for (int i = 0; i < 10; i++) {
            n = new node(10-i, n);
        }
        return n ;
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