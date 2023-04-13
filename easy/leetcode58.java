class Solution {
    // This method takes a string input `s` and returns the length of the last word in the string
    public int lengthOfLastWord(String s) {
        int l = s.length() - 1; // Initialize a pointer to the last character in the string
        int count = 0; // Initialize a counter for the length of the last word

        // Loop through the string from the last character to the first
        for (; l >= 0; l--) {
            char input = s.charAt(l); // Get the character at the current position

            // If the current character is a space and count is 0, skip the iteration
            if (input == ' ' && count == 0) {
                continue;
            }

            // If the current character is a space, break out of the loop
            if (input == ' ') {
                break;
            }

            // If the current character is not a space, increment the count of the last word length
            count++;
        }

        // Return the length of the last word
        return count;
    }
}
