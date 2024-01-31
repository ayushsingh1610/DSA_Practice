// Write a Java program to calculate the largest gap between sorted elements of an array of integers.
import java.util.*;
public class code49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int length = sc.nextInt();
        int a[] = new int[length];

        System.out.print("Enter the elements = ");
        for (int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Largest Gap between sorted elements is = " + Largest_Gap(a));
    }
    public static int Largest_Gap(int a[])
    {
        int gap=0;
        for (int i=a.length-2;i>=0;i--) {
            int temp =a[i+1] - a[i];
            if(temp>gap)    gap=temp;
        }
        return gap;
    }
}
