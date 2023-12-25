// Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1.
import java.util.*;
public class code23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int len = sc.nextInt();

        if(len>=1)
        {
            int a[] = new int[len];
            System.out.print("Enter the elements of array = ");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println("Difference of largest and smallest element is = " + (a[len-1] - a[0]));
        }
    }
}
