// Write a Java program to shuffle a given array of integers.
import java.util.*;
public class code42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];

        System.out.print("Enter the elements = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int result[] = new int[l];
        Random rand = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = a[rand.nextInt(0,l-1)];
        }
        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}
