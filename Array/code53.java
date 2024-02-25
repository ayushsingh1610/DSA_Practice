// 4 Sum
import java.util.*;
public class code53
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // int a[] = {1,0,-1,0,-2,2};
        long starttime = System.currentTimeMillis();
        // int a[] = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        int a[] = {1000000000,1000000000,1000000000,1000000000};
        System.out.println("Answer using Brute Force method = ");
        Display(four_Sum_2(a,8));
        long endtime = System.currentTimeMillis(); 
        long seconds = endtime - starttime;
        System.out.println(seconds);
        System.out.println("Answer using method = ");
        
    }
    // Brute Force
    public static List<List<Integer>> four_Sum_1(int a[],int target)
    {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int j2 = j+1; j2 < a.length; j2++) {
                    for (int k = j2+1; k < a.length; k++) {
                        if(a[i]+a[j]+a[j2]+a[k]== target)
                        {
                            List<Integer> temp = Arrays.asList(a[i],a[j],a[j2],a[k]);
                            temp.sort(null);
                            st.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    // Optimal method
    public static List<List<Integer>> four_Sum_2(int a[],int target)
    {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);

        for(int i=0;i<a.length;i++)
        {
            if(i>0 && a[i]==a[i-1])     continue;
            for(int j=i+1; j<a.length;j++)
            {
                if(j>i+1 && a[j]==a[j-1])      continue;
                int k = j+1;
                int l = a.length-1;

            while(k<l)
            {
                long sum = a[i];
                sum+=a[j];
                sum+=a[k];
                sum+=a[l];
                if(sum==target)
                {
                    List<Integer> temp = new ArrayList<>();
                    temp = Arrays.asList(a[i], a[j], a[k], a[l]);
                    // temp.add(a[i]);
                    // temp.add(a[j]);
                    // temp.add(a[k]);
                    // temp.add(a[l]);
                    ans.add(temp);
                    k++; l--;


                    while(k<l && a[k]==a[k-1])  k++;
                    while(k<l && a[l]==a[l+1])  l--;
                }
                else if(sum<target)
                {
                    k++;
                }
                else
                {
                    l--;
                }
            }
        }
    }
        
        return ans;
    }

    // Display Method
    public static void Display(List<List<Integer>> list)
    {
        for (List<Integer> list2 : list) {
            System.out.println(list2);
        }
    }
}