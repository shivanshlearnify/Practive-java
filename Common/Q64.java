// check the string is pallidrome 

public class Q64 {
    public static void main(String args[]){
    String str = "nssoon";
    System.out.println(ispallidrome(str));
    
    }
    public static boolean ispallidrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

}
