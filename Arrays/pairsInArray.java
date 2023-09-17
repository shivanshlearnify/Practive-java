public class pairsInArray {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr = i;
            for(int j=i+1; j<arr.length; j++){
                System.out.print(arr[curr]+","+arr[j]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        int arr[] = {2,4,6,8,10};
        print(arr);

    }
}
