public class CheckIfString_Pallindrome {
    public static boolean Search(String str){
        int start = 0;
        int last = str.length()-1;
        while(start<last){
            if(str.charAt(start)!= str.charAt(last)){
                return false;
            } 
            start++;
            last--;
        }
        return true;
        // int length = str.length();
        // for (int i = 0; i < length / 2; i++) {
        //     if (str.charAt(i) != str.charAt(length - i - 1)) {
        //         return false;
        //     }
        // }
        // return true;
    }
    public static void main(String args[]){
        String str = "shiva";
       System.out.println(Search(str));
         
    }
}
