// Write a Java program to find the smallest and second smallest elements of a given array.
import java.util.*;
public class code31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Enter the elements of array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Smallest element = " + a[0]);
        System.out.println("2nd Smallest element = " + a[1]);
    }
}
