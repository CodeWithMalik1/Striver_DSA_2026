public class arraysortedornot {
     public static boolean sort(int arr[]){
        int n=arr.length-1;
        int i=1;
        while(i<=n){
            if(arr[i-1]>arr[i]) return false;
            else i++;
        }
        return true;
        
    }
	public static void main(String[] args) {
	    int nums[]={1,6, 2, 3, 4, 5};
	    
		System.out.println(sort(nums));
	}
}
