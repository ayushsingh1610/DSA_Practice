// Write a Java program to calculate the average value of array elements.
import java.util.*;
public class code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] =sc.nextInt();
        }
        int sum=0;
        for(int i : a)
        {
            sum+=i;
        }
        System.out.println("Average of array element is = " + (sum/n));
    }
}
