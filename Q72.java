

public class Q72 {
    public static void main(String args[]){
        String str = "1061";
        if(find(str)){
            System.out.println("is binary");
        }else {
            System.out.println("not binary");
        }

    }
    public static boolean find(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='0' && str.charAt(i)=='1'){
                return true;
            } 
            }
            return false;
        }
    }

