public class Q88 {
    public static void main(String args[]) {
        String names = "shiva";
        find(names);
      
    }

    public static void find(String names){
            int n = names.length();
            for(int i=0; i<n; i++){
                for(int j=0; j<n-i; j++){
                        System.out.print(names.charAt(j));
                }
                System.out.println();
            }
           
}
}
