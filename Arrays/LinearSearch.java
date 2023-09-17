public class LinearSearch{

    public static boolean find(int arr[], int num){
        for (int i : arr) {
            if(i==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
       int arr[] = {4,6,9,7,5,2,3,1,10,15,19};
       int num = 10;
       System.out.println(find(arr, num));
    }
}