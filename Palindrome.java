public class Palindrome
{
     public  boolean isPalindrome(int n) {
         int rev=0;
         int dup=n;
         while(n>0){
             int rem=n%10;
             rev=rev*10+rem;
             n=n/10;
         }
         return dup==rev;

    }
	public static void main(String[] args) {
	    Palindrome obj=new Palindrome();
		System.out.println("Hello World");
		int n=1234;
		int n1=121;
		System.out.println(obj.isPalindrome(n));
		System.out.println(obj.isPalindrome(n1));
	}
}