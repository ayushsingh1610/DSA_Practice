// Write a Java program to test two arrays' equality.
import java.util.*;
public class code19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array 1 : Enter the length of array = ");
        int l1 = sc.nextInt();
        int a[] = new int[l1];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Array 2 : Enter the length of array = ");
        int l2 = sc.nextInt();
        int b[] = new int[l2];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        if(isEqual(a,b))
        System.out.println("Both Array are equal.");

        else
        System.out.println("Arrays are not equal");
    }
    public static boolean isEqual(int a[], int b[])
    {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]!=b[i])
                return false;
            }
        }
        return true;
    }
}
