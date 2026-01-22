
import java.util.*;

public class divisorsofN {
    public static int[] printDivisors(int n){
        int div=1;
        ArrayList<Integer> divisors=new ArrayList<>();

        while(div<=n){
            if(n%div==0){
                divisors.add(div);

            }
            div++;
        }
        int[] arr=new int[divisors.size()];
        for(int i=0;i<divisors.size();i++){
            arr[i]=divisors.get(i);
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=28;
        int[] divisors=printDivisors(n);
        printArray(divisors);
        
    }
    
}
