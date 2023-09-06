public class Q76 {
        public static void main(String args[]){
           String names = "GEEKsforGeeks";
           find(names);
        }  
        
        public static void find(String names){
            // int n = names.length();
            // for(int i=n-1; i>=0; i--){
            //    System.out.print(names.charAt(i));
            // }
            // System.out.println();
            StringBuilder str = new StringBuilder(names);
            System.out.println(str.reverse());
            
        }
}
