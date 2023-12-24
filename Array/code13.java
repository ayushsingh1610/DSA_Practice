// Write a Java program to find common elements between two integer arrays.
import java.util.*;
public class code13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of both array =  ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.print("Enter the elements of 1st array = ");
        for (int i = 0; i < b.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the elements in 2nd array = ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            if(isPresent(a[i],b))
            System.out.print(a[i] + " ");
        }
    }
    public static boolean isPresent(int n, int a[])
    {
        for (int i = 0; i < a.length; i++) {
            if(n==a[i])
            return true;
        }
        return false;
    }
}
