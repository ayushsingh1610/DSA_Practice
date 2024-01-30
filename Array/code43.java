// Write a Java program to check if a given array contains a subarray with 0 sum.
import java.util.*;
public class code43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Enter the elements = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        if(SUM_ZERO(a))
        System.out.println("Contains Sum Zero");

        else
        System.out.println("Doesn't contain Sum Zero");
    }
    

    public static boolean SUM_ZERO(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            int sum = a[i];
            for (int j = i+1; j < a.length; j++) {      //Start the Jth index after the ith index
                sum+=a[j];                              //Take the sum from ith to jth index
                if(sum==0)
                {
                    return true;
                } 
            }
        }
        return false;
    }
}
