//  Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
import java.util.*;
public class code22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int k=0;
        System.out.print("Enter the elements of array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            if(a[i]!=0)
            b[k++] =a[i]; 
        }
        Display(b);
    }
    public static void Display(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
