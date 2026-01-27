import java.util.*;
public class longestsubarray
{
  
    public static int subarray(int arr[],int k){
        int n=arr.length;
        int left=0,right=0;
        int sum=arr[0];
        int maxLen=0;
        while(right<n){
            while(left<right && sum>k){
                sum=sum-arr[left];
                left++;
            }        
            if(sum==k){
                maxLen=Math.max(maxLen,right-left+1);
                
            }
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return maxLen;
    }

	public static void main(String[] args) {
	   int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(subarray(nums,k));
        
	
	}
}