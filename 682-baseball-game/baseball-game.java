class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int sumOfAll = 0;

for (String op : operations) {
    if (op.equals("+")) {
        int a = stack.pop();
        int b = stack.peek();
        stack.push(a);
        stack.push(a + b);
    } else if (op.equals("D")) {
        stack.push(stack.peek() * 2);
    } else if (op.equals("C")) {
        stack.pop();
    } else {
        stack.push(Integer.parseInt(op));
    }
}
                
        for (int stacks : stack) {
            sumOfAll += stacks;
        }
        return sumOfAll;

    }
}