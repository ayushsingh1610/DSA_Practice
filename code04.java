// Write a Java program to test if an array contains a specific value.
import java.util.*;
public class code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total elements of array = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be search = ");
        int key = sc.nextInt();

        while(n>0)
        {
            if(a[n-1] == key)
            System.out.println("Element found ");

            n--;
        }
    }
}
