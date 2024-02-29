// Find missing and repeating number.
import java.util.*;
public class code58
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        int a[][] = {{3,1,2,5,3},{3,1,2,5,4,6,7,5}};
        for (int i = 0; i < a.length; i++) {
            System.out.println("Results are = ");
            calculate(a[i]);
        }

    }
    // Brute Force
    public static void calculate(int a[])
    {
        Arrays.sort(a);
        int repeating=0,missing=0;
        List<Integer> list = new ArrayList<>();
        list.add(a[0]);
        for (int i = 1; i < a.length; i++) {
            if(a[i] - a[i-1] == 0)
                repeating = a[i];

            list.add(a[i]);
        }
        for (int i = 1; i <=a.length; i++) {
            if(!list.contains(i))
                missing = i;
        }

        System.out.printf("Repeating element is = %d\nMissing Element is = %d\n\n", repeating,missing);
    }
}