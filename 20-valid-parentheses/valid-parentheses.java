class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();   // 1️⃣ 泛型改成 Character
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            // 左括号：直接进栈
            if (ch[i] == '{' || ch[i] == '[' || ch[i] == '(') {
                stack.push(ch[i]);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.peek();
                if (!isPair(last, ch[i])) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private boolean isPair(char last, char cur) {
        return (last == '(' && cur == ')') ||
               (last == '{' && cur == '}') ||
               (last == '[' && cur == ']');
    }
}
