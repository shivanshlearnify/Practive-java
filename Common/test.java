import java.util.*;

public class test {
    public static void main(String args[]) {
        int n = 192;
       
        String a = Integer.toString(n);
        String b = Integer.toString(n*2);
        String c = Integer.toString(n*3);

        String d = a+b+c;
        String e = "";
        for(int i=0; i<d.length(); i++){
            if(d.charAt(i)<='9' && d.charAt(i)>='1'){
                e = "true";

            } else {
                 e = "false";
            }
        }
        System.out.println(e);
       


    }

}
