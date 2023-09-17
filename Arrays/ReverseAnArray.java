public class ReverseAnArray {
    public static void Reverse(int arr[]){
        int first=0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int arr[] ={1,2,3,4,5,6,7,8,9};
        Reverse(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
// public class ReverseAnArray {
//     public static void main(String args[]) {
//         Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//         List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//         Collections.reverse(list);
        
//         Integer[] reversedArray = list.toArray(new Integer[0]);
        
//         for (int value : reversedArray) {
//             System.out.print(value + " ");
//         }
//     }
// }