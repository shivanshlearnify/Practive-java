public class Q86 {
    public static void main(String args[]) {
        String names = "#GeeKs01fOr@gEEks07";
        
    }

    public static int[] find(String names){
            int n = names.length();
            int count [] = new int[4];
            for(int i=0; i<n; i++){
                       if(Character.isUpperCase(names.charAt(i))){
                       count[0]++;
               } else  if(Character.isLowerCase(names.charAt(i))) {
                       count[1]++;
               } else  if(Character.isDigit(names.charAt(i))) {
                       count[2]++;
               } else {
                       count[3]++;
               }
          }  return count;
}
}
