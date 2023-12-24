// Write a Java program to convert an ArrayList to an array.
import java.util.*;
public class code17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(34);
        a.add(23);
        a.add(45);
        int arr[] = new int[a.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.get(i);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
