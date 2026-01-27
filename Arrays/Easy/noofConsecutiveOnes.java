import java.util.*;
public class noofConsecutiveOnes
{
    public static int consecutive(int arr[]){
        int c=0;
        int maxCon=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                c++;
                maxCon=Math.max(maxCon,c);
                
            }
            else {
               
                c=0;
              
            }
        }
        return maxCon;
    }

	public static void main(String[] args) {
	   int arr[]={0,1,1,1,1,0,0,1,1,1,0};
	   System.out.println(consecutive(arr));
	    
	    
		
	}
}