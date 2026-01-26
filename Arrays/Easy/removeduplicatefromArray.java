import java.util.*;
public class removeduplicatefromArray
{
   
     public static ArrayList<Integer> removeDuplicates(int[] nums) {
         HashMap<Integer,Integer> mp=new HashMap<>();
         ArrayList<Integer> arr=new ArrayList<>();
         for(int i=0;i<nums.length;i++){
             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
         }
         for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
             
                 arr.add(entry.getKey());
          
         }
         return arr;
        
    }
    public static void printArr(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
	public static void main(String[] args) {
	    int nums[]={0, 0, 3, 3, 5, 6};
	    ArrayList<Integer> arr=removeDuplicates(nums);
	    printArr(arr);
	    
	
	}
}