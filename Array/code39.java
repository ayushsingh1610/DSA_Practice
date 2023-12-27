// Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.
import java.util.*;
public class code39 {
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
            if(a[i]%2!=0){
            for (int j = i+1; j < a.length; j++) {
                if(a[j]%2==0)
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    break;
                }
            }
        }
        else
        {
            for (int j = 0; j < a.length; j++) {
                a[i] = a[j];
            }
        }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
