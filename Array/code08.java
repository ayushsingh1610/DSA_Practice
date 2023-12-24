// Write a Java program to insert an element (specific position) into an array.
import java.util.*;
public class code08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in array = ");
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be added = ");
        int key = sc.nextInt();

        System.out.print("Enter the position where element should be added = ");
        int pos = sc.nextInt();
        int ans[] = insert(a,key,pos);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        
    }
    public static int[] insert(int a[], int key, int pos)
    {
        int k=0;
        int ans[] = new int[a.length + 1];
        for (int i = 0; i < ans.length; i++) {
            if(i!= pos)
            {
                ans[i] = a[k++];
            }
            else
            {
                ans[i] = key;
            }

        }
        return ans;
    }
}
