class Solution {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle);
        // Get the lengths of the needle and haystack strings
        int nl = needle.length();
        int hl = haystack.length();
        
        // If the haystack is shorter than the needle, the needle can't be a substring of the haystack
        if (hl < nl)
            return -1;

        // Iterate through each substring of the haystack that has the same length as the needle
        for(int i = 0; i < hl - nl + 1; i++){
            // Get the substring starting from index i and with length nl
            String match = haystack.substring(i, nl + i);
            
            // Check if the substring matches the needle
            if (match.equals(needle))
                // Return the starting index of the substring if there is a match
                return i;
        }

        // Return -1 if the needle is not found in the haystack
        return -1;
    }
}
