// Write a Java program to check if a sub-array is formed by consecutive integers from a given array of integers.
import java.util.*;
public class code45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of sub array = ");
        int l = sc.nextInt();
        int subarray[] = new int [l];
        for (int i = 0; i < l; i++) {
            subarray[i] = sc.nextInt();
        }

        if(Check_Consecutive(subarray))
        System.out.println("Sub Array is Consecutive");

        else
        System.out.println("Sub Array is NOT Consecutive");
    }
    public static boolean Check_Consecutive(int arr[])
    {
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);

        // Check if the difference between adjacent elements is 1
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] != 1) {
                return false;
            }
        }

        // If all differences are 1, it is a consecutive sub-array
        return true;
    }
}
