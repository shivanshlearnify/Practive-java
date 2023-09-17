public class DiagonalSum {
    public static int sum(int arr[][]){
        int sum = 0;
        int n = arr.length-1;
        // for(int i=0; i<arr.length; i++){
        //    for(int j=0; j<arr.length; j++){
        //      if(i==j || i+j==n){
        //         sum += arr[i][j];
        //      }
             
        //    }
        // }
        for(int i=0; i<arr.length; i++){
           sum += arr[i][i];
           if(i != n-i){
              sum += arr[i][n-i];
           }
          
        }
        return sum;
    }
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8, },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };

        System.out.println(sum(arr));
           
    }

}
