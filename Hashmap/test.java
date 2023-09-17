public class test {
    
        public static void main(String[] args) {
            int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
            findLargestSubarrayWithSumZero(arr);
        }
    
        public static void findLargestSubarrayWithSumZero(int[] arr) {
            int maxLength = 0;
            int startIndex = -1;
            int endIndex = -1;
    
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = i; j < arr.length; j++) {
                    sum += arr[j];
                    if (sum == 0 && j - i + 1 > maxLength) {
                        maxLength = j - i + 1;
                        startIndex = i;
                        endIndex = j;
                    }
                }   
            }
    
            if (startIndex != -1) {
                System.out.println("Largest subarray with sum 0 is from index " + startIndex + " to " + endIndex);
                for (int k = startIndex; k <= endIndex; k++) {
                    System.out.print(arr[k] + " ");
                }
            } else {
                System.out.println("No subarray found with sum 0.");
            }
        }
    
    
}
