class Solution {
    public boolean isPalindrome(int x) {
        // Check if x is negative or ends in zero (excluding 0 itself), which cannot be palindromes.
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;

        int r = 0;

        // Reverse the digits of x and store in r.
        while (x > r) {
            r = x % 10 + r * 10; // Take the last digit of x, add it to r, then multiply r by 10 to shift digits left.
            x /= 10; // Remove the last digit of x.
        }

        // Check if x and r are palindromes (or if r has an extra middle digit when x has an odd number of digits).
        return x == r || x == r/10;
    }
}

