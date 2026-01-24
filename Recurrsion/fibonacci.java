
class Main {
    
    public int fibonacci(int n){
        if(n<=1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
   
    public static void main(String[] args) {
        Main obj=new Main();
        System.out.println(obj.fibonacci(3));
        
    }

    
}