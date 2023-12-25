// Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.
import java.util.*;
public class code25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Enter the elements = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt(); 
        }
        int sum =0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 10)
            sum+=a[i];
        }
        if(sum == 30)
        System.out.println("True");

        else
        System.out.println("False");
    }
}
