// Write a Java program to find all combinations of four elements of an array whose sum is equal to a given value.
import java.util.*;
public class code33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the target value = ");
        int target = sc.nextInt();
        for (int i = 0; i < a.length-3; i++) {
            for (int j = i+1; j < a.length-2; j++) {
                for (int j2 = j+1; j2 < a.length-1; j2++) {
                    for (int k = j2+1; k < a.length; k++) {
                        if(a[i] + a[j] + a[j2] + a[k] == target)
                        System.out.printf("%d, %d, %d, %d\n", a[i],a[j],a[j2],a[k]);
                    }
                }
            }
        }
    }
}
