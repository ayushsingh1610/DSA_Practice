// Write a Java program to determine whether numbers in an array can be rearranged so that each number appears exactly once in a consecutive list of numbers. Return true otherwise false.
import java.util.*;
public class code50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length = ");
        int l = sc.nextInt();
        int a[] = new int[l];

        System.out.print("Enter the elements = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        if(is_Only_Once(a))
        System.out.println("Elements are appears only once");

        else
        System.out.println("Elements are NOT appears only once");

    }
    public static boolean is_Only_Once(int a[])
    {
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]==a[i+1])
            return false;
        }
        return true;
    }
}
