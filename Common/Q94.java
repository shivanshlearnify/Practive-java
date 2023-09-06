public class Q94 {
    public static void main(String args[]){
        int arr[] = {1,2,5,4,5,6};
        System.out.println(check(arr, 5, 0));
    }

    public static int check(int arr[],int key, int i){
        if(i == arr.length-1){
           return -1;
        }
        int isfound = check(arr, key, i+1);
         if(isfound!= -1){
            return isfound;

        }
        if(arr[i]==key){
            return i;
        }
       
        return isfound;
    }
}
