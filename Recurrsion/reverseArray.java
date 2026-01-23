
public class reverseArray {
    public static void reverse(int arr[]){
        int l=arr.length-1;
        int f=0;
        while(f<l){
            int temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            l--;
            f++;
        }
        printArr(arr);
        
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5};
		reverse(arr);
		
	}
}
