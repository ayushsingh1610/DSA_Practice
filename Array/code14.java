
// Write a Java program to remove duplicate elements from an array.
import java.util.*;

public class code14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total element in array = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int ans[] = removeDuplicate(a);
        Arrays.sort(ans);
        System.out.print("[");
        for (int i : ans) {
            if (i != 0)
                System.out.print(i + " ");
        }
        System.out.print("]");
    }

    public static int[] removeDuplicate(int a[]) {
        int ans[] = new int[a.length];
        int k = 0, temp = -1;
        for (int i = 0; i < a.length; i++) {
            if (temp != a[i]) {
                ans[k++] = a[i];
                temp = a[i];
            }
        }
        return ans;
    }

}
