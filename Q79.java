public class Q79 {
        public static void main(String args[]){
           String names = "123456789";
           find(names);
           
        }  
        
        public static void find(String names){
            int n = names.length();
            for(int i=0; i<n; i+=2){
               System.out.print(names.charAt(i));
            }
            System.out.println();
           
            
        }
}
