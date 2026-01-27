public class singleOccuranceInARRAy {
    public static int singleoccurance(int arr[])
{
        int xorr=0;
        for(int i=0;i<arr.length;i++){
            xorr=xorr^arr[i];
        }
       return xorr;
    }

	public static void main(String[] args) {
	   int arr[]={1,0,0,1,2,3,3};
	   System.out.println(singleoccurance(arr));
	
	}
}
    
    

