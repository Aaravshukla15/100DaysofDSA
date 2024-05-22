// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Link - https://leetcode.com/problems/valid-parentheses/description/
// Solution

class Solution {
   public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } else if (current == ')' || current == '}' || current == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (!isMatchingPair(top, current)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
