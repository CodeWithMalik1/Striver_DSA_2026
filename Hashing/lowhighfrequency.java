import java.util.*;

public class lowhighfrequency
{
public void frequency(int[] arr){
     HashMap <Integer,Integer> mp=new HashMap<>();
     for(int num : arr){
         mp.put(num,mp.getOrDefault(num,0)+1);
     }
     int lowfreq=Integer.MAX_VALUE;
     int highfreq=Integer.MIN_VALUE;
     int lowvalue=-1;
     int highvalue=-1;
    
     for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        if(entry.getValue()<lowfreq){
            lowfreq=entry.getValue();
            lowvalue=entry.getKey();
        }
        if(entry.getValue()>highfreq){
            highfreq=entry.getValue();
            highvalue=entry.getKey();
        }
           
     }
        System.out.println("Lowest Frequency is : "+lowfreq+" of digit : "+lowvalue);
        System.out.println("Highest Frequency is : "+highfreq+" of digit : "+highvalue);

    }
	public static void main(String[] args) {
	   lowhighfrequency obj=new lowhighfrequency();
		int[] arr = {1,1,1,4,4,4,4, 3, 2, 3, 4, 3};
        obj.frequency(arr); 
	}
}