class Solution {
    public int romanToInt(String s) {
        // Create a new HashMap to store symbol-value pairs
        HashMap<Character, Integer> r = new HashMap<Character, Integer>();

        // Add symbol-value pairs to the HashMap
        r.put('I', 1);
        r.put('V', 5);
        r.put('X', 10);
        r.put('L', 50);
        r.put('C', 100);
        r.put('D', 500);
        r.put('M', 1000);

        // Initialize result variable to 0
        int result = 0;

        // Loop through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            char input = s.charAt(i);

            // Add the value of the current symbol to the result
            result += r.get(input);

            // Check for "subtractive" cases
            if (i > 0) {
                if ((input == 'V' || input == 'X') && s.charAt(i-1) == 'I') {
                    // If the current symbol is V or X and the previous symbol is I,
                    // subtract twice the value of I from the result
                    result -= 2;
                } else if ((input == 'L' || input == 'C') && s.charAt(i-1) == 'X') {
                    // If the current symbol is L or C and the previous symbol is X,
                    // subtract twice the value of X from the result
                    result -= 20;
                } else if ((input == 'D' || input == 'M') && s.charAt(i-1) == 'C') {
                    // If the current symbol is D or M and the previous symbol is C,
                    // subtract twice the value of C from the result
                    result -= 200;
                }
            }
        }

        // Return the final result
        return result;
    } 
}
