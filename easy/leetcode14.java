class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Initialize the prefix string with the first string in the array
        String pre = strs[0];
        
        // Iterate through the array of strings, comparing the prefix to each string
        for (int i=1; i < strs.length; i++){
            // While the prefix is longer than the current string or the prefix is not a substring of the 
current string, remove the last character from the prefix
            while( pre.length() > strs[i].length() || !(strs[i].substring(0, pre.length()).equals(pre))) {
                // If the prefix becomes empty, there is no common prefix, so return an empty string
                if(pre.length() == 0)
                    return "";
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        
        // Return the final prefix
        return pre;
    }
}
