
public class Ntoone {
    public static void printNto1(int n){
        //base case
      if(n==0){
        return;
      }
      System.out.print(n+" ");
      printNto1(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNto1(n);
    }
    
}
