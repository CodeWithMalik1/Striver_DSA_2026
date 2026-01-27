import java.util.ArrayList;

public class unionoftwoarrays {
    public static ArrayList<Integer> union(int arr1[],int arr2[]){
        ArrayList<Integer> unionArr=new ArrayList<>();
        int m=arr1.length;
        int n=arr2.length;
        int i=0,j=0;
        while(i<m&&j<n){
            if(arr1[i]<arr2[j]){
                unionArr.add(arr1[i]);
                i++;
                
            }
            else if(arr1[i]>arr2[j]){
                unionArr.add(arr2[j]);
                j++;
            }
            else{
                unionArr.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<m){
            unionArr.add(arr1[i]);
            i++;
        }
        while(j<n){
            unionArr.add(arr2[j]);
            j++;
        }
        return unionArr;
        
    }
    public static void printArr(ArrayList<Integer> arr){
        for (int i=0;i<arr.size() ;i++){
            System.out.print(arr.get(i)+" ");
        } 
        System.out.println();
    }
	public static void main(String[] args) {
	    int arr1[]={1,2,3,6};
	    int arr2[]={2,3,4,5,6,7};
	    ArrayList<Integer> newArr=union(arr1,arr2);
	    printArr(newArr);
	    
	    
		
	}
}
