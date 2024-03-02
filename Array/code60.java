// Reverse pair.
import java.util.*;
public class code60
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        int a[][]  = {{40,25,19,12,9,6,2},{1,3,2,3,1},{3,2,1,4}};

        System.out.println("Results are = ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(Reverse_Pair(a[i]));
        }
    }
    // Brute Force
    public static List<List<Integer>> Reverse_Pair(int a[])
    {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = i+1; j < a.length; j++) {
                if(a[i]>(2*a[j]))
                {
                    list = Arrays.asList(a[i],a[j]);
                    ans.add(list);
                }
            }
        }
        // Display(ans);
        return ans;
    }

    public static void Display(List<List<Integer>> ans)
    {
        for (List<Integer> list : ans) {
            System.out.print(list + " ");
        }
    }
}