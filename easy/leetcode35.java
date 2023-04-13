class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            // If the target value is found at index i, return i
            if (target == nums[i])
                return i;
      
            // If target is smaller than the first element, it should be inserted at index 0
            if (i == 0 && target < nums[i])
                return i;
            
            // If we are at the end of the array and target is greater than the last element, it should be inserted at the end
            else if (i == nums.length - 1) {
                if (target > nums[i])
                    return i+1;
            }
            // If target is greater than the current element and smaller than the next element, it should be inserted at the next index
            else {
                if (target > nums[i] && target < nums[i + 1])
                    return i+1;
            }
        }
        // If target is not found and should be inserted, it should be inserted at the end of the array
        return nums.length;
    }
}
