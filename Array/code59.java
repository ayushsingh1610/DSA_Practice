// Inversion pair
import java.util.*;
public class code59
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        int a[][] = {{1,2,3,4,5},{5,4,3,2,1},{5,3,2,1,4},{5,3,2,4,1}};

        for (int i = 0; i < a.length; i++) {
            // Display(Inversion_pair_1(a[i]));
            System.out.println(Inversion_pair_1(a[i]).size());
        }
    }
    public static void Display(List<List<Integer>> a)
    {
        for (List<Integer> list : a) {
            if(!list.isEmpty())
            System.out.print(list +  " ");
        }
        System.out.println();
    }
    // Brute Force (My solution)
    public static List<List<Integer>> Inversion_pair_1(int a[])
    {
        List<List<Integer>> ans = new ArrayList<>(0);

        for (int i = 0; i < a.length-1; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j])
                    temp = Arrays.asList(a[i],a[j]);
                
                else 
                    continue;

                ans.add(temp);
            }
        }
        return ans;
    }

    // For returning just the size
    /*
     * public static List<List<Integer>> Inversion_pair_1(int a[])
    {
        int count=0;

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j])
                    count++;
            }
        }
        return count;
    }
     */

}