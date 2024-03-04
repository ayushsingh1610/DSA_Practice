// Reverse pair.
import java.util.*;
public class code60
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        int a[][]  = {{40,25,19,12,9,6,2},{1,3,2,3,1},{3,2,1,4},{4, 1, 2, 3, 1}};
        int ans[] = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println("Results are = ");
        // for (int i = 0; i < a.length; i++) {
        //     // System.out.println(Reverse_Pair(a[i]));
        //     System.out.println("Counting = " + Reverse_Pair_count(a[i]));
        //     System.out.println("Merging = " + Merge_Sort(a[i], 0, a[i].length-1));
        // }
        // System.out.println(Merge_Sort(ans, 0, ans.length -1));
        System.out.println(Reverse_Pair(ans));
    }
    // Brute Force
    public static List<List<Integer>> Reverse_Pair(int a[])
    {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            List<Integer> list = new ArrayList<>(0);

            for (int j = i+1; j < a.length; j++) {
                if(a[i]>(2*a[j]) && (2*a[j]) <= Integer.MAX_VALUE)
                {
                    list = Arrays.asList(a[i],a[j]);
                    ans.add(list);
                }
                else 
                {
                    ans.add(list);
                    return ans;
                }
            }
        }
        // Display(ans);
        System.out.println(Integer.MAX_VALUE);
        return ans;
    }
    public static int Reverse_Pair_count(int a[])
    {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>(2*a[j]))
                {
                    count++;
                }
            }
        }
        return count;
    }

    // Optimal Merge Approach
    public static void Merging(int a[], int low, int mid, int high)
    {
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high)
        {
            if(a[left]<a[right])
            {
                list.add(a[left]);
                left++;
            }
            else
            {
                list.add(a[right]);
                right++;
            }
            while(left<=mid)    list.add(a[left++]);
            while(right<=high)  list.add(a[right++]);
        }
        // System.out.println(list);
        for (int i = low; i <= high; i++) {
            a[i] = list.get(i - low);
        }
    }
    public static int Count_pair(int a[], int low, int mid, int high)
    {
        int right = mid+1;
        int count =0;
        for (int i = low; i <= mid; i++) {
            while(right<=high && a[i]>(2 * a[right]))
            {   
                right++;  
                
            }   
            count+= (right - (mid + 1));
            // System.out.println("c = "+ count+ " ");
        }
        return count;
    }
    public static int Merge_Sort(int a[], int low, int high)
    {
        int count =0;
        if(low>=high)   return count;
        int mid = (low+high)/2;

        count+= Merge_Sort(a,low,mid);
        count+= Merge_Sort(a, mid+1, high);
        count+= Count_pair(a,low,mid,high);
        Merging(a, low, mid, high);

        return count;
    }
    

    public static void Display(List<List<Integer>> ans)
    {
        for (List<Integer> list : ans) {
            System.out.print(list + " ");
        }
    }
}