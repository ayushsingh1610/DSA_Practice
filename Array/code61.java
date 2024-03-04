// Maximum product subarray.
import java.util.*;
class code61
{
	public static void main(String[] args) {
		int a[][] = {{2,3,-2,4},{1,2,3,4,5,0},{1,2,-3,0,-4,-5},{-1, 3, 0, -4, 3}, {1,-2,3,-4}};

		for (int i=0;i<a.length ;i++ ) {
			System.out.println("1. Maximum product = " + Max_Product_Subarray(a[i]));
			System.out.println("2. Maxi = " + Max_Product_Subarray2(a[i]));
			System.out.println("3. Maximum = " + Max_Product_Subarray3(a[i]));
			System.out.println();
		}
		
	}
	// Brute Force
	public static int Max_Product_Subarray(int a[])
	{
		int max_product = 0;
		for (int i=0;i<a.length ;i++ ) {
			int product = a[i];
			for (int j=i+1;j<a.length ;j++ ) {
				product*= a[j];
				max_product = Math.max(product, max_product);
			}
		}
		return max_product;
	}
	// Optimal approach by me. (Failed in one case)
	public static int Max_Product_Subarray2(int a[])
	{
		int mp = 1;
		int left =0,right =0;
		int p =1;
		while(right <a.length)
		{
			p*=a[right];
			if(p>mp)
			{
				mp = p;
			}
			else if(p==0)
			{
				p=1;
			}
			
			right++;
		}
		return mp;
	}
	// Optimal Approach By Striver
	public static int Max_Product_Subarray3(int a[])
	{
		int prefix =1, suffix=1;
		int maxi = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(prefix == 0)		prefix =1;
			if(suffix == 0)		suffix = 1;

			prefix*= a[i];
			suffix*= a[a.length - i - 1];

			maxi = Math.max(maxi, Math.max(prefix, suffix));
		}
		return maxi;
	}
}