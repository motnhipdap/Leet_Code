package Solution;

import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1)
            return false;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                else {
                    char c1 = stack.pop();
                    if (c1 == '(' && c != ')')
                        return false;
                    else if (c1 == '[' && c != ']')
                        return false;
                    else if (c1 == '{' && c != '}')
                        return false;
                }
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()][{}"));
    }

}
