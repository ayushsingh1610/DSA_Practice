// Write a Java program to separate 0s and 1s in an array of 0s and 1s into left and right sides.
import java.util.*;
public class code32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        int b[] = new int[l];
        int left=0,right=l-1;
        System.out.print("Enter the elements in array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            if(a[i]==0)
            b[left++] = a[i];
            
            else
            b[right--] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
