public class Q77 {
        public static void main(String args[]){
           String names = "i love to practice";
           System.err.println(find(names));
        }  
        
        public static String find(String str){
           
            StringBuilder sh = new StringBuilder();
            sh.append(Character.toUpperCase(str.charAt(0)));
            
            for(int i=1; i<str.length(); i++){
              if(str.charAt(i)==' '&& i<str.length()-1){
                sh.append(str.charAt(i));
                i++;
                sh.append(Character.toUpperCase(str.charAt(i)));
              } else {
                sh.append(str.charAt(i));
              }
            }
            return sh.toString();
        }
}
