public class zeroToEnd {
     public static int[] checkzeros(int arr[]){
        int n=arr.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return arr;
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
   
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
	public static void main(String[] args) {
	    int nums[]={1,2,0,0,3,0,4,5};
	   int newArr[]=checkzeros(nums);
	    printArr(newArr);
	    
	
	}
    
}
