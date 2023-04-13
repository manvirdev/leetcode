class Solution {
    public int[] runningSum(int[] nums) {
        // Create a new array to store the running sums
        int[] result = new int[nums.length];
        
        // Initialize a variable to keep track of the running sum
        int sum = nums[0];
        
        // Set the first element of the result array to be the first element of the input array
        result[0] = nums[0];
        
        // Loop through the input array starting from the second element
        for(int i =1; i < nums.length; i++){
            // Add the current element to the running sum
            sum += nums[i];
            
            // Set the current element of the result array to be the running sum
            result[i] = sum;
        }
        
        // Return the result array
        return result;
    }
}