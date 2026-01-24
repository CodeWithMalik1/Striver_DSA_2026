
class reverseString {
    public static void reverseStr(String str){
        char[] charArr=str.toCharArray();
        int first=0;
        int last=charArr.length-1;
        while(first<last){
            char temp=charArr[first];
            charArr[first]=charArr[last];
            charArr[last]=temp;
            first++;
            last--;
        }
        printArr(charArr);
    }
    public static void printArr(char arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        reverseStr("hello");    
        
    }

    
}