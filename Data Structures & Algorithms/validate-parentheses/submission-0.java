class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character,Character> CloseToOpen = new HashMap<Character,Character>();

        // Map CLOSING brackets (keys) to OPENING brackets (values)
        CloseToOpen.put(')','(');
        CloseToOpen.put(']','[');
        CloseToOpen.put('}','{');

        for (char c : s.toCharArray()) {

            // If it is a closing bracket
            if (CloseToOpen.containsKey(c)) {
                // Stack must not be empty, and the top must match the opening bracket
                if (!stack.isEmpty() && stack.peek() == CloseToOpen.get(c)) {
                    stack.pop(); // Match found, remove it
                } else {
                    return false; // Mismatch or stack was empty when a close bracket appeared
                }
            }
            else{
                // It is an opening bracket, push it onto the stack
                stack.push(c);
            }
        }
        // If the stack is empty, all brackets were matched perfectly
        return stack.isEmpty(); // all poped out
    }
}
