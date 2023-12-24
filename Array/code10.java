// Write a Java program to find duplicate values in an array of integer values.
import java.util.*;
class code10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in array = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int ans[] = Duplicate(a);

        for (int i : ans) {
            if(i!=0)
            System.out.print(i + " ");
        }
    }
    public static int[] Duplicate(int a[])
    {
        int ans[] = new int[a.length];
        int k=0,count =0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = i+1; j < ans.length; j++) {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(count >= 1 && isNOTPresent(ans,a[i]))
            ans[k++] = a[i];
            count =0;
        }
        return ans;
    }
    public static boolean isNOTPresent(int a[], int n)
    {
        for (int i = 0; i < a.length; i++) {
            if(n==a[i])
            return false;
        }
        return true;
    }
}