class Solution {
    public int removeDuplicates(int[] nums) {
        // Initialize the first element and the two pointers
        int firstElement = nums[0]; // first element in the array
        int k = 0; // pointer to the last unique element found so far
        int i; // pointer to scan through the array

        // Loop through the array
        for (i = 0; i < nums.length; i++) {
            // If the current element is different from the last unique element,
            // update the last unique element and copy the current element to its position
            if (nums[k] != nums[i]) {
                k++; // update the pointer to the last unique element
                nums[k] = nums[i]; // copy the current element to the position of the last unique element
            }
            // If the current element is a duplicate, skip it
        }

        // Return the length of the new array with duplicates removed
        return k + 1;
    }
}
