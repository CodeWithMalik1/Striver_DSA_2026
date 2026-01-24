

public class onetoN {
    public static void print1toN(int n){
        //base case
      if(n==0){
        return;
      }
      print1toN(n-1);
      System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=5;
        print1toN(n);
    }
    
}
