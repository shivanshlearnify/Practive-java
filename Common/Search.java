public class Search {
    public static void main(String args[]) {
        int arr[][] ={ { 10, 20, 30, 40 },
                       { 15, 25, 35, 45 },
                       { 27, 29, 37, 48 },
                       { 32, 33, 39, 50 } };
        int key = 40;
        print(arr, key);
        
    }

    public static boolean print(int arr[][], int key) {
            int row=arr.length-1; int col= 0;

            while(row>=0 && col<arr.length){
                if(arr[row][col]==key){
                    System.out.println("key is at "+ row + "," + col);
                    return true;
                }
                else if(key > arr[row][col]){
                    col++;
                   }else {
                    row--;
                   }
               
            }
             System.out.println("key not found");
                return false;
            
    }
}
