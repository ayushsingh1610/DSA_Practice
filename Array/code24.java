// Write a Java program to compute the average value of an array of integers except the largest and smallest values.
import java.util.*;
public class code24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Enter the elements = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        } 
        int sum =0;
        Arrays.sort(a);
        for (int i = 1; i < a.length-1; i++) {
            sum+=a[i];
        }
        System.out.println("Average of array elements except smallest and largest = " + sum/(l-2));
    }
}
