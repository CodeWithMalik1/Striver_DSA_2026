
class Main {
    public static boolean palindrome(String str){
        char[] charArr=str.toCharArray();
        int first=0;
        int last=charArr.length-1;
        while(first<last){
            char temp=charArr[first];
            if(charArr[first]==charArr[last]){
                first++;
                last--;
            }
            else return false;
            
            
        }
        return true;
    }
   
    public static void main(String[] args) {
        String str="malayalam";
        String str1="palindrome";
        System.out.println(palindrome(str));
        System.out.println(palindrome(str1));
        
    }

    
}