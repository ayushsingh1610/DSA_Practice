// Write a Java program to get the majority element from an array of integers containing duplicates.
// Majority element: A majority element is an element that appears more than n/2 times where n is the array size.
import java.util.*;
public class code29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a[] = {1,2,3,2,4,2,5,2,2,2};
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Enter the elements of array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number whose appearance to be checked = ");
        int n = sc.nextInt();
        int oc=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==n)
            oc++;
        }
        if(oc>=(a.length/2))
        System.out.println(n+ " is Majority number");

        else
        System.out.println(n + " is NOT a Majority number");
    }
}
