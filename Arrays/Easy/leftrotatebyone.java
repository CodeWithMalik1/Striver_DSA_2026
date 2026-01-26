import java.util.*;
public class leftrotatebyone
{
    public static int[] rotate(int arr[]){
        int n=arr.length-1;
         int first=arr[0];
        for(int i=0;i<n;i++){
            arr[i]=arr[i+1];
        }
        arr[n]=first;
        return arr;
       
    }
  
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
	public static void main(String[] args) {
	    int nums[]={1,2,3,4,5};
	   int newArr[]=rotate(nums);
	    printArr(newArr);
	    
	
	}
}