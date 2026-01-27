public class linearsearchsolution {
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,3,4,6};
	    int key=3;
	    System.out.println(linearsearch(arr,key));
		
	}
    
}
