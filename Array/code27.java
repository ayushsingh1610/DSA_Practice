// Write a Java program to remove duplicate elements from a given array and return the updated array length.Sample array: [20, 20, 30, 40, 50, 50, 50]. After removing the duplicate elements the program should return 4 as the new length of the array.
import java.util.*;
public class code27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Enter the elements of array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Length of array after remove duplicate is = " + RemoveDuplicate(a));
    }
    public static int RemoveDuplicate(int a[])
    {
        HashSet<Integer> ob = new HashSet<Integer>();
        int oc=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j])
                oc++;
            }
            if(oc==0)
            ob.add(a[i]);
            
            oc=0;
        }
        for (Integer integer : ob) {
            System.out.println(integer);
        }
        return ob.size();
    }
}
