// Write a Java program to find common elements in three sorted (in non-decreasing order) arrays.
import java.util.*;
public class code21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        int b[] = new int[l];
        int c[] = new int[l];

        input(a);
        input(b);
        input(c);

        System.out.print("Common elements in array are = ");
        for (int i = 0; i < c.length; i++) {
            if(isPresent(b, a[i]) && isPresent(c, a[i]))
            System.out.print(a[i] + " ");
        }
    }
    public static void input(int a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements in array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
    public static boolean isPresent(int a[], int n)
    {
        for (int i = 0; i < a.length; i++) {
            if(n==a[i])
            return true;
        }
        return false;
    }
}
