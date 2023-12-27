// Write a Java program to sort an array of positive integers from an array. In the sorted array the value of the first element should be maximum, the second value should be a minimum, third should be the second maximum, the fourth should be the second minimum and so on.
import java.util.*;
public class code38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Enter the elements in array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int b[] = new int[l]; 
        int min=0,max=l-1;
        for (int i = 0; i < a.length; i++) {
            if(i%2==0)
            b[i] = a[max--];

            else
            b[i] = a[min++];
        }
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
