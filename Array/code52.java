// 3Sum 
import java.util.*;
public class code52
{
    public static void main(String args[])
    {
        List<List<Integer>> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // int a[] = {-1,0,1,2,-1,-4};
        int a[] = {-1,0,1,0};
        int sum =0;
        for (int i = 0; i < a.length-2; i++) {
            for (int j = i+1; j < a.length-1; j++) {
                for (int j2 = j+1; j2 < a.length; j2++) {
                    List<Integer> list = new ArrayList<>();
                    if(a[i] + a[j] + a[j2]==sum)
                    {
                        list.add(a[i]);
                        list.add(a[j]);
                        list.add(a[j2]);
                    }
                    ans.add(list);
                }
            }
        }
        for (List<Integer> i : ans) {
            if(!i.isEmpty())
            System.out.println(i);
        }
    }
}