// Write a Java program to convert an array to an ArrayList.
import java.util.*;
public class code16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
        }
        System.out.print("Array elements in ArrayList = ");
        for (Integer integer : a) {
            System.out.print(integer + " ");
        }
        
    }
}
