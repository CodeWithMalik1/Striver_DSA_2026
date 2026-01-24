import java.util.*;

public class countFrequency
{
public void frequency(int[] arr){
     HashMap <Integer,Integer> mp=new HashMap<>();
     for(int num : arr){
         mp.put(num,mp.getOrDefault(num,0)+1);
     }
    
     for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
 
            System.out.println(entry.getKey()+" has occured "+entry.getValue());
     }

    }
	public static void main(String[] args) {
	    countFrequency obj=new countFrequency();
		int[] arr = {1, 3, 2, 3, 4, 3, 2};
        obj.frequency(arr); 
	}
}