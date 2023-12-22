// Write a Java program to sum values of an array.
import java.util.*;
class code01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements = ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println("Sum of all element of array = " + sum);

    }
}