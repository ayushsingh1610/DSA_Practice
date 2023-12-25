// Write a Java program to check if an array of integers contains two specified elements 65 and 77.
import java.util.*;
public class code26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Enter the elements = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        if(isPresent(a, 65) && isPresent(a, 77))
            System.out.println("Both numbers are present.");

        else
            System.out.println("Both numbers are not present.");
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
