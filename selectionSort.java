public class selectionSort {
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        print(arr);
    }

    public static void print (int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minValue = i;
            for(int j=i+1; j<arr.length; j++){
                     if(arr[minValue]>arr[j]){
                        minValue = j;
                     }
            }
            int temp = arr[i];
            arr [i]= arr[minValue];
            arr[minValue] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
    }
}
}
