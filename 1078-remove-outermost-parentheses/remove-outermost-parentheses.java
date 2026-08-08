class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder b = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    b.append(c);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    b.append(c);
                }
            }
        }

        return b.toString();
    }
}