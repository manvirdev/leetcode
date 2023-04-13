class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Initialize a HashMap to store values and their indices in the array
        HashMap<Integer, Integer> vals = new HashMap<Integer, Integer>();
        
        // Put the first value in the HashMap with its index as the value
        vals.put(nums[0], 0);
        
        // Iterate through the rest of the array
        for(int i = 1; i < nums.length; i++){
            int value = nums[i];
            
            // Check if the complement of the current value exists in the HashMap
            if(vals.containsKey(target - value)){
                // If it does, return the indices of the two values
                return (new int[]{vals.get(target-value), i});
            }
            
            // If the complement does not exist in the HashMap, add the current value and its index to the HashMap
            vals.put(value,i);
        }
        
        // If no solution is found, return null
        return null;
    }
}