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
    //Hasing method 
    public static void calculate2(int a[])
    {
        int hasharray[] = new int[a.length+1];
        int repeating =-1, missing =-1;
        for (int i = 0; i <a.length; i++) {
            hasharray[a[i]]++;
        }
        for (int i = 1; i < hasharray.length; i++) {
            if(hasharray[i]==2)     repeating = i;
            if(hasharray[i]==0)    missing = i;
        }
        System.out.printf("Repeating element is = %d\nMissing Element is = %d\n\n", repeating,missing);
    }

    //optimal approach
    public static void calculate3(int a[])
    {
        int n = a.length;
        int all_sum = (n*(n+1))/2;
        int all_sum_square = (n*(n+1)*(2*n + 1))/6;

        long sum =0, sum_square=0;

        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            sum_square += (a[i]*a[i]);
        }
        long value_1 = all_sum - sum;
        long value_2 = all_sum_square - sum_square;
        value_2 = value_2/value_1;

        int missing = (int)(value_1+value_2)/2;
        int repeating = (int)(value_2-missing);

        System.out.printf("Repeating element is = %d\nMissing Element is = %d\n\n", repeating,missing);
    }


}