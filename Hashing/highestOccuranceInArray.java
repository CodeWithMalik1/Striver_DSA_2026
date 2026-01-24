import java.util.*;

public class highestOccuranceInArray{
public int highestOccurance(int[] arr){
     HashMap <Integer,Integer> mp=new HashMap<>();
     for(int num : arr){
         mp.put(num,mp.getOrDefault(num,0)+1);
     }
     int maxFreq=0;
     int result=0;
     for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
     }
     return result;
     
        
    }
	public static void main(String[] args) {
	    highestOccuranceInArray obj=new highestOccuranceInArray();
	    
		int[] arr = {1, 3, 2, 3, 4, 3, 2};
        System.out.println(obj.highestOccurance(arr)); 
	}
}