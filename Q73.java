

public class Q73 {
        public static void main(String args[]){
           String names[] = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
           System.out.println(find(names, 5));

        }  
        
        public static String find(String names[], int n){
            String largest = names[0];
            for(int i=0; i<n; i++){
                if(names[i].length()>largest.length()){
                    largest = names[i];
                }
            }
            return largest;
        }
}
