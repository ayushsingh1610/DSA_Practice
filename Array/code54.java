// Number of Subarray
public class code54
{
    public static void main(String args[])
    {
        int a[] = {4, 2, 2, 6, 4};
        System.out.println("Number of subarray = " + number_of_subarray(a, 6));
    }
    // Brute force
    public static int number_of_subarray(int a[],int k)
    {
        int count =0;

        for (int i = 0; i < a.length; i++) {
            int sum =0;
            for (int j = i; j < a.length; j++) {
                sum+=a[j];

                if(sum==k)      count++;
            }
        }
        return count;
    }
}