// Write a Java program to remove a specific element from an array.
import java.util.*;
public class code06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.print("Enter the elements = ");
        for(int i=0;i<10;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be remove = ");
        int key = sc.nextInt();
        int ans[] = remove(a,key);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    public static int[] remove(int a[], int key)
    {
        int ans[] = new int[a.length-1];
        int k=0;
        for (int i = 0; i < a.length; i++) {
            if(key != a[i])
            {
                ans[k++] = a[i];
            }
            else
            continue;
        }
        return ans;
    }
}
