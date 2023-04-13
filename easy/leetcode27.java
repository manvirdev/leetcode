class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Initialize a pointer to keep track of the new length of the array
        int count = 0; // Initialize a counter for the number of non-val elements in the array
        
        for (int i = 0 ; i < nums.length ; i++) { // Traverse the array
            k = i; // Set the pointer to the current index
            
            // If the current element is val, find the next non-val element
            while (nums[k] == val) {
                if (k == nums.length - 1) // If we reach the end of the array, return the count
                    return count;
                k++; // Move the pointer to the right
            }
            
            // If we found a non-val element to the right of the current element, swap the two elements
            if (k != i) {
                nums[i] = nums[k];
                nums[k] = val;
            }
            
            count++; // Increment the count for each non-val element we encounter
        }
        
        return count; // Return the final count
    }
}
