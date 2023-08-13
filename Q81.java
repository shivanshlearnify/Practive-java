public class Q81 {
        public static void main(String args[]){
           String names = "ckjkUUYII";
           find(names);
           
        }  
        
        public static void find(String names){
            int n = names.length();
            int count = 0;
            for(int i=0; i<n; i++){
               if(Character.isUpperCase(names.charAt(i))){
                count++;
               }
            }
            System.out.println(count);
           
            
        }
}
