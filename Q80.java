public class Q80 {
        public static void main(String args[]){
           String names = "welcome to geeksforgeeks";
           find(names);
           
        }  
        
        public static void find(String names){
            int n = names.length();
            for(int i=0; i<n; i++){
                char x = names.charAt(i);
               if( x =='a' ||  x =='e' ||  x =='i' ||  x =='o' ||  x =='u'  ){
                continue;
               }
               System.out.print(names.charAt(i));
            }
            System.out.println();
           
            
        }
}
