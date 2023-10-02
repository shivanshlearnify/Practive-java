import java.util.HashMap;

public class test {
    HashMap<Integer, Integer> numToIndexMap = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        
        if (numToIndexMap.containsKey(complement)) {
            return new int[]{numToIndexMap.get(complement), i};
        }
        
        numToIndexMap.put(nums[i], i);
    }
    
    return new int[0]; // No solution found


    HashMap<Integer, Integer> numToIndex = new HashMap<>();

    // Iterate through the array
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        
        // Check if the complement exists in the HashMap
        if (numToIndex.containsKey(complement)) {
            // If found, return the indices of the two elements
            return new int[]{numToIndex.get(complement), i};
        }
        
        // If not found, put the current element and its index into the HashMap
        numToIndex.put(nums[i], i);
    }
    
    // If no solution is found, return an empty array or throw an exception as needed
    return new int[0];
}
