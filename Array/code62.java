// Merge Overlapping Intervals.
import java.util.*;
// import java.io.*;
public class code62
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        int a[][] = {{1,3},{2,6},{8,10},{15,18}};

        System.out.println("Answer = " + Merge_Overlapping_1(a));
        System.out.println("Answer = " + Merge_Overlapping_2(a));
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

    // optimal approach
    public static List<List<Integer>> Merge_Overlapping_2(int a[][])
    {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(a[0][0], a[0][1]));
        for (int i = 1; i < a.length; i++) {
            
            if(a[i][1]<ans.get(ans.size()-1).get(0))        // For skip the overlapping element
            {
                continue;
            }
            else if(a[i][0]<ans.get(ans.size()-1).get(1))   // Change the ans list if possible
            {
                int temp = Math.max(a[i][1], ans.get(ans.size()-1).get(1));         // Store the max of last elements
                ans.get(ans.size()-1).set(1,temp);                                  // Change the ans list
            }
            else 
            {
                ans.add(Arrays.asList(a[i][0], a[i][1]));                                 //Store the new pair if it is not overlapping
            }
        }
        
        return ans;
    }
}