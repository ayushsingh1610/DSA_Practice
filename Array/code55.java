// Length of the longest subarray with zero Sum
import java.util.*;
public class code55
{
    public static void main(String args[])
    {
        int a[][] = {{6, -2, 2, -8, 1, 7, 4, -10},{9, -3, 3, -1, 6, -5},{1, 3, -5, 6, -2},{1, 0, -5}};
        for (int j = 0; j < a.length; j++) {
            System.out.println("Max length of subaaray is = " + largest_subarray(a[j], 0));
        }
        
    }

    //  Better approach
    public static int largest_subarray(int a[], int k)
    {
        int max = 0;

        // List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int sum =0;
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < a.length; j++) {
                sum+=a[j];
                list.add(a[j]);

                if(sum==k){
                    // ans.add(list);
                    max = Math.max(max,list.size());
                }
            }
        }
        return max;
    }
}