import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int total = 0;
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if (op.equals("C")) {
                s.pop();
            }
            else if (op.equals("D")) {
                s.push(s.peek() * 2);
            }
            else if (op.equals("+")) {
                int last = s.pop();
                int new1 = last + s.peek();
                s.push(last);
                s.push(new1);
            } 
            else {
                s.push(Integer.parseInt(op));
            }
        }
        while (!s.isEmpty()) {
            total += s.pop();
        }
        return total;
    }
}