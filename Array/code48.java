// Write a Java program to find all triplets equal to a given sum in an unsorted array of integers.
import java.util.*;
public class code48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int length = sc.nextInt();
        int arr[] = new int[length];

        System.out.print("Enter the elements = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Sum value = ");
        int sum = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = j; j2 < arr.length; j2++) {
                    if(arr[i] + arr[j] + arr[j2] == sum)
                    System.out.printf("[ %d, %d, %d ]\n", arr[i],arr[j],arr[j2]);
                }
            }
        }
    }
}
