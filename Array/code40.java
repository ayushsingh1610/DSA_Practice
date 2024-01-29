
// Write a Java program to replace every element with the next greatest element (from the right side) in a given array of integers. There is no element next to the last element, therefore replace it with -1. 
import java.util.*;

public class code40 {
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
            for (int j = i; j < a.length; j++) {
                if (a[i] < a[j]) {
                    a[i] = a[j];
                    break;
                } else
                    a[i] = -1;
            }

        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
