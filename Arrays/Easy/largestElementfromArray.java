
public class largestElementfromArray {
    public int largestElement(int[] nums) {
        int largest=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        return largest;

    
    }
    public static void main(String args[]){
        largestElementfromArray obj=new largestElementfromArray();
        int[] arr={1,8,2,3,4,5};
        System.out.println(obj.largestElement(arr));
    }
}
