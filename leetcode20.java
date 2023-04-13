class Solution {
    public boolean isValid(String s) {
        // Create a new stack to keep track of opening brackets
        Stack<Character> stack = new Stack<Character>();

        // Declare variables for input and top of stack
        char input, top;

        // Loop through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // Get the current character
            input = s.charAt(i);

            // If the character is an opening bracket, push it onto the stack
            if (input == '(' || input == '{' || input == '[')
                stack.push(input);

            // If the character is a closing bracket, check if it matches the top of the stack
            if (input == ')' || input == ']' || input == '}') {

                // If the stack is empty, there is no opening bracket to match the closing bracket, so the input is invalid
                if (stack.isEmpty())
                    return false;

                // Pop the top character from the stack and compare it to the current closing bracket
                top = stack.pop();

                // If the top and current characters don't match, the input is invalid
                if (!((top == '(' && input == ')') || (top == '[' && input == ']') || (top == '{' && input == '}')))
                    return false;
            }
        }

        // If the stack is empty, all opening brackets have been matched with closing brackets, so the input is valid
        if (stack.isEmpty())
            return true;

        // If there are still opening brackets on the stack, the input is invalid
        return false;
    }
}
