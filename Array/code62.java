// Merge Overlapping Intervals.
import java.util.*;
// import java.io.*;
public class code62
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        int a[][] = {{1,3},{2,6},{8,10},{15,18}};

        List<List<Integer>> ans = new ArrayList<>();
        ans = Merge_Overlapping_1(a);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> Merge_Overlapping_1(int a[][])
    {
        List<List<Integer>> ans = new ArrayList<>();
        // ans = Arrays.asList(a[0][0], a[0][1]);
        
        for (int i = 0; i < a.length; i++) {
            int start = a[i][0];
            int end = a[i][1];

            if(!ans.isEmpty() && end <= ans.get(ans.size() -1 ).get(1))      //This skips the overlapping pairs
            {
                continue;
            }

            for (int j = i+1; j < a.length; j++) {          // Iterate the following list
                if(a[j][0]<=end)                            // Checks the end value of ith element from the (i+1)th element
                {
                    end = Math.max(end, a[j][1]);           // Store whose end value is greater
                }
                else
                {
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));              //Store only the highest end value from following list
        }
        return ans;
    }
}