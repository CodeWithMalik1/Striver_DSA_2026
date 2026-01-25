
public class largestAndSmallest {
     public int secondLargest(int arr[]){
        int firstlargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>firstlargest){
               secondLargest=firstlargest;
               firstlargest=arr[i];
           } 
           else if(arr[i]<firstlargest && arr[i]>secondLargest){
               secondLargest=arr[i];
           }
        } 
        return secondLargest;
    }
    public int secondSmallest(int arr[]){
        int firstSmallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]<firstSmallest){
               secondSmallest=firstSmallest;
               firstSmallest=arr[i];
           } 
           else if(arr[i]>firstSmallest && arr[i]<secondSmallest){
               secondSmallest=arr[i];
           }
        } 
        return secondSmallest;
    }
	public static void main(String[] args) {
	    largestAndSmallest obj=new largestAndSmallest();
		int arr[]={8, 8, 7, 6, 5};
		System.out.println("Second Largest :"+obj.secondLargest(arr));
        System.out.println("Second Smallest :"+obj.secondSmallest(arr));
	}
}
