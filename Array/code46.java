// Write a Java program to rearrange a given array of unique elements such that every second element of the array is greater than its left and right elements.
import java.util.*;
class code46
{
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };
        // int a[] = Input();
        int result[] = Rearrangement(arr);
        Display(result);

    }
    public static int[] Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        
        int a[] = new int[l];

        System.out.print("Enter the elemenets = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static int[] Rearrangement(int arr[])
    {
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);

        // Create a new array to store the rearranged elements
        int[] result = new int[n];

        // Initialize pointers for the new array
        int left = 0, right = n - 1;

        // Traverse the sorted array and fill the result array
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Fill the even indices with smaller elements
                result[i] = arr[left];
                left++;
            } else {
                // Fill the odd indices with larger elements
                result[i] = arr[right];
                right--;
            }
        }
        return result;
    }
    public static void Display(int a[])
    {
        System.out.println("Elements are arrange in given order = ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
