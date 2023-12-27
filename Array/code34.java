// Write a Java program to check whether there is a pair with a specified sum in a given sorted and rotated array.
import java.util.*;
public class code34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Enter the element in array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the target value = ");
        int target = sc.nextInt();
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] + a[j] == target)
                System.out.println(a[i] + "," + a[j]);
            }
        }
    }
}
