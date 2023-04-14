class Solution {
   public int[] plusOne(int[] digits) {
    // Get the length of the input array
    int l = digits.length;
    
    // Set the current index and current element to the last element of the array
    int currentIndex = l-1;
    int currentElement = digits[l-1];

    // Iterate through the array from right to left, looking for a non-9 digit
    while (currentElement == 9){
        // If we've reached the left end of the array and all digits are 9, we need to create a new array with 
one more digit
        if(currentIndex == 0 ){
            int[] newArr = new int[l+1];
            Arrays.fill(newArr, 0);
            newArr[0] = 1;
            return newArr;
        }
        
        // Otherwise, set the current digit to 0 and move to the next digit to the left
        digits[currentIndex] = 0;
        currentIndex--;
        currentElement = digits[currentIndex];
    }
    
    // Increment the first non-9 digit that we encountered from the right and return the array
    digits[currentIndex]++;
    return digits;
  }
}
