public class Q83 {
        public static void main(String args[]){
           char names []= {'a','b','c'};
           find(names);
           
        }  
        
        public static void find(char names[]){
            int n = names.length;
            String str = "";
            for(int i=0; i<n; i++){
             str += names[i];
            }
            System.out.println(str);
           
            
        }
}
