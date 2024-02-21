// 3Sum 
import java.util.*;
public class code52
{
    public static void main(String args[])
    {
        List<List<Integer>> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a[] = {-1,0,1,2,-1,-4};
        // int a[] = {-1,0,1,0};
        Display(three_Sum1(a));
        System.out.println();
        Display(three_Sum2(a));
        System.out.println();
        Display(three_Sum3(a));
    }
    // Brute Force 
    public static List<List<Integer>> three_Sum1(int a[])
    {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < a.length-2; i++) {
            for (int j = i+1; j < a.length-1; j++) {
                for (int j2 = j+1; j2 < a.length; j2++) {
                    List<Integer> list = new ArrayList<>();
                    if(a[i] + a[j] + a[j2]==0)
                    {
                        list.add(a[i]);
                        list.add(a[j]);
                        list.add(a[j2]);
                    }
                    ans.add(list);
                }
            }
        }
        return ans;
    }
    
    // Another better approach 
    public static List<List<Integer>> three_Sum2(int a[])
    {
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = i+1; j < a.length; j++) {
                int third = -(a[i] + a[j]);

                if(temp.contains(third))
                {
                    List<Integer> list = new ArrayList<>();
                    list = Arrays.asList(a[i], a[j], third);
                    list.sort(null);
                    st.add(list);
                }
                temp.add(a[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    // Optimal Approach 
    public static List<List<Integer>> three_Sum3(int a[])
    {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            if(i>0 && a[i]==a[i-1])     continue;

            int j=i+1;
            int k=a.length-1;
            
            while(j<k)
            {
                int sum = a[i] + a[j] + a[k];
                if(sum<0)
                {
                    j++;
                }
                else if(sum >0)
                {
                    k--;
                }
                else
                {
                    List<Integer> temp = new ArrayList<>();
                    temp = Arrays.asList(a[i], a[j],a[k]);
                    ans.add(temp);
                    j++;    k--;
                    while(j<k && a[j]==a[j-1])  j++;
                    while(j<k && a[k]==a[k+1])  k--;
                }
            }
        }
        return ans;
    }
    public static void Display(List<List<Integer>> ans)
    {
        for (List<Integer> i : ans) {
            if(!i.isEmpty())
            System.out.println(i);
        }
    }
}