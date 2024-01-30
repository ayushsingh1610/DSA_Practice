// Write a Java program to print all sub-arrays with 0 sum present in a given array of integers.
import java.util.*;
public class code44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Enter the elements = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int sum = a[i];
            for (int j = i+1; j < a.length; j++) {      //Start the Jth index after the ith index
                sum+=a[j];                              //Take the sum from ith to jth index
                if(sum==0) Display(a,i,j);              //Checks the condition and display if it sum value is ZERO
            }
        }
    }
    public static void Display(int a[], int start, int end)
    {
        for (int i = start; i <= end; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
