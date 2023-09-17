public class searchIn2DArray {
    public static void search(int arr[][], int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]==key){
                    System.out.println(i+","+j);
                }
            }
        }
    }
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8, },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
            search(arr, 12);
    }

}