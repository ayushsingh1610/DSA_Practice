// Write a Java program to cyclically rotate a given array clockwise by one.  
import java.util.*;
public class code35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Enter the elements in array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int last = a[l-1];
        for (int i = l-1;i>=1;i--) {
            a[i] = a[i-1];
        }
        a[0] = last;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
