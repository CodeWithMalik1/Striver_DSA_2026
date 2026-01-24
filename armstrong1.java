public class armstrong1 {
    public static boolean isArmstrong(int n){
        int sum=0;
        int temp=n;
        while(temp>0){
            int last=temp%10;
            sum+=last*last*last;
            temp/=10;
        }
        if(sum==n){
            return true;
        }
        return false;
    }    public static void main(String[] args){
    int n=123;
    System.out.println(isArmstrong(n));

    }
    
}
