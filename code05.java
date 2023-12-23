// Write a Java program to find the index of an array element.
import java.util.*;
public class code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println();
        for(int i=0;i<10;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be search = ");
        int key = sc.nextInt();
        Arrays.sort(a);
        System.out.println("Element found at index = " + FindIndex(a, key));
    }
    public static int FindIndex(int a[], int key)
    {
        int l=0, h=a.length-1,mid;

        while(l<=h)
        {
            mid = (l+h)/2;

            if(a[mid] == key)
            return mid;

            if(a[mid]>key)
            h = mid-1;

            else
            l = mid+1;
        }
        return 0;
    }
}
