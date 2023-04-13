// class Solution {
//     public int pivotIndex(int[] nums) {
//         int leftSum = nums[0];
//         int leftIndex = 0;
//         int rightSum = nums[nums.length - 1];
//         int rightIndex = nums.length - 1;

//         while (Math.abs(leftIndex - rightIndex) != 1){
//             if(leftSum > rightSum){
//                 rightIndex--;
//                 rightSum += nums[rightIndex];
//             }else if (rightSum > leftSum){
//                 leftIndex++;
//                 leftSum += nums[leftIndex];
//             }else
//                 return leftIndex + 1;
//         }
//         return -1;
//     }
// }

class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;  // initialize the sum of elements to the left of the current index to 0
        int sum = 0;  // initialize the sum of all elements in the array to 0
        for(int x : nums) sum += x;  // calculate the sum of all elements in the array

        for(int i=0; i < nums.length; i++){  // iterate through each index in the array
            if(leftSum == sum - leftSum - nums[i])  // check if the sum of elements to the left of the index is equal to the sum of elements to the right of the index
                return i;  // return the index if it is a pivot index

            leftSum += nums[i];  // add the current element to the sum of elements to the left of the index
        }

        return -1;  // return -1 if there is no pivot index
    }
}
