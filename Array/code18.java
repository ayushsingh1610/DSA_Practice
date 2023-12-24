// Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
import java.util.*;
public class code18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the target = ");
        int target = sc.nextInt();

        HashMap<Integer,Integer> ob = new HashMap<Integer,Integer>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] + a[j] == target)
                {
                    ob.put(a[i],a[j]);
                }
            }
        }
        for (Integer i : ob.keySet()) {
            System.out.println(i + " " + ob.get(i));
        }
    }
}
