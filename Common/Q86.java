public class Q86 {
    public static void main(String args[]) {
        String names = "sdiblc22ss11dbud";
        find(names);
      
    }

    public static void find(String names){
            int n = names.length();
            for(int i=0; i<n; i++){
                if(Character.isDigit(names.charAt(i))){
                        System.out.print(names.charAt(i));
                }
            }
            System.out.println();
           
}
}
