// Write a Java program to find a missing number in an array.
import java.util.*;
public class code20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int len = sc.nextInt();
        int a[] = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt(); 
        }
        System.out.println("Missing number in array is = " + isMissing(a));
    }
    public static int isMissing(int a[])
    {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if((i+1)!=a[i]) 
            return i+1;
        }
        return 0;
    }
}
