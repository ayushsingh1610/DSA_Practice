// Inversion pair
import java.util.*;
public class code59
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        int a[][] = {{1,2,3,4,5},{5,4,3,2,1},{5,3,2,1,4},{5,3,2,4,1}};
        int ans[] = {5,3,2,4,1};
        // for (int i = 0; i < a.length; i++) {
        //     // Display(Inversion_pair_1(a[i]));
        //     System.out.println(Inversion_pair_1(a[i]).size());
        //     System.out.println(Merge_Sort(a[i], 0, a[i].length-1));
        // }
        System.out.println(Merge_Sort(ans,0,4));
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
    // Optimal Approach
    public static int Merge_Sort(int a[], int low, int high)
    {
        int count =0;
        if(low>=high)   return count;
        
        int mid = (low+high)/2;

        count+= Merge_Sort(a,low,mid);
        count+= Merge_Sort(a, mid+1, high);
        count+= Merging(a, low, mid, high);

        return count;

    }
    public static int Merging(int a[], int low, int mid, int high)
    {
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        int count = 0;
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
                count+=(mid-left + 1);
                right++;
            }
        }
        while(left<=mid)    list.add(a[left++]);
        while(right<=high)  list.add(a[right++]);

        // So that we can put the arranged elements in original array otherwise they return the unsorted elements 
        for (int i = low; i <= high; i++) {
            a[i] = list.get(i - low);
        }
        System.out.println(list);
        return count;
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