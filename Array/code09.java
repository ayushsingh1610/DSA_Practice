// Write a Java program to find the maximum and minimum value of an array.
import java.util.*;
public class code09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements in array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Maximun element is = " + a[l-1]);
        System.out.println("Minimum element is = " + a[0]);
    }
}
