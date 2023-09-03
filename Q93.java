public class Q93 {
    public static void main(String args[]){
        int arr[] = {1,2,5,4,5,6};
        System.out.println(check(arr, 91, 0));
    }

    public static int check(int arr[],int key, int i){
        if(i == arr.length-1){
           return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return check(arr, key, i+1);
    }
}
