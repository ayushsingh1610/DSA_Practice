// Write a Java program to find the largest number from a given list of non-negative integers.
import java.util.*;
public class code47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();

        int a[] = new int[l];

        System.out.print("Enter the elemenets = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("The largest number formed is = " + Largest_Number(a));
    }
    public static int Largest_Number(int a[])
    {
        int number = 0;
        for (int i = a.length-1; i >=0; i--) {
            number = (number *10) + a[i];
        }

        return number;
    }
}
