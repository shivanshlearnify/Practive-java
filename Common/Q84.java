public class Q84 {
        public static void main(String args[]){
           String names = "uuuusssuu";
          find(names);
           
        }  
        
        public static void find(String names){
            int n = names.length();
            
            for(int i=0; i<n; i++){
               System.out.print(Character.toUpperCase(names.charAt(i)));
            }
            
           
            
        }
}
