public class Q74 {
        public static void main(String args[]){
           String names = "Geeks  forG   eeks";
           System.out.println(find(names));

        }  
        
        public static String find(String names){
          
        //    StringBuilder str = new StringBuilder("") ;
        //     for(int i=0; i<names.length(); i++){
        //         if(names.charAt(i) == ' '){
        //         continue;
        //         } else {
        //            str.append(names.charAt(i));
        //         }
        //     }
        //     return str.toString();
        return names.replaceAll(" ", "");
            
        }
}
