// Write a Java program to find the two elements in a given array of positive and negative numbers such that their sum is close to zero.
import java.util.*;
public class code30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Enter the elements in array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]+a[j] == 0)
                System.out.println(a[i] + "," + a[j]);
            }
        }
    }
}
