package ValidParentheses;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("[])"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            Character letter = s.charAt(i);
            if (i == 0) {
                if (letter == ')' || letter == ']' || letter == '}') {
                    return false;
                }
            }
            if (letter == '(' || letter == '[' || letter == '{') {
                stack.add(letter);
            } else {
                if (!stack.empty()) {
                    Character last = stack.peek();
                    if (letter == ']' && last == '[') {
                        stack.pop();
                    } else if (letter == ')' && last == '(') {
                        stack.pop();
                    } else if (letter == '}' && last == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }else{
                    stack.add(letter);
                }

            }
        }


        return stack.empty();
    }
}