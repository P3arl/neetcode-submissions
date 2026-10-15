class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeOpenMap = new HashMap<>();
        closeOpenMap.put(')', '(');
        closeOpenMap.put(']', '[');
        closeOpenMap.put('}', '{');

        for(char c: s.toCharArray()) {
            if(closeOpenMap.containsKey(c)) {
                if(!stack.isEmpty() && stack.peek() == closeOpenMap.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
