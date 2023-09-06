public class Q82 {
        public static void main(String args[]){
           String names = "uuuusssuu";
          System.out.println(find(names));
           
        }  
        
        public static Boolean find(String names){
            int n = names.length();
           
            for(int i=0; i<n; i++){
               if(names.charAt(i)!=names.charAt(0)){
               return false;
               }
            }
            return true;
           
            
        }
}
