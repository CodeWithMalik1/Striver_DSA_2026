class missingNumber{
     public static int missingNum(int arr[]){
        int n=arr.length;
        int actualSum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return actualSum-sum;
    }
    public static void main(String[] args) {
         int nums[]={0,1,2,3,4,6,5,9,8};
	     System.out.println("missed Number : "+missingNum(nums));
    }
}