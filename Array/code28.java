// Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.Sample array: [49, 1, 3, 200, 2, 4, 70, 5]|.The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.
import java.util.*;
public class code28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the elements in array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Length of consecutive elemenst sequence = " + consecutiveelements(a));
    }
    public static int consecutiveelements(int a[])
    {
        HashSet<Integer> ob = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]-1 || a[i]==(a[j]+1))
                ob.add(a[i]);
            }
        }
        for (Integer integer : ob) {
            System.out.print(integer + " ");
        }
        return ob.size();
    }
}
