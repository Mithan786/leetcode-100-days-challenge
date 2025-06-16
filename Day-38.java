#Q-1: Remove Duplicate Letters?
  class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];

        // Step 1: Store the last occurrence of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            lastIndex[ch - 'a'] = i;
        }

        boolean[] present = new boolean[26]; // Tracks whether a character is in the stack
        Stack<Character> st = new Stack<>();

        // Step 2: Build the result using stack
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (!present[idx]) {
                while (!st.isEmpty() && st.peek() > ch && lastIndex[st.peek() - 'a'] > i) {
                    present[st.pop() - 'a'] = false;
                }
                st.push(ch);
                present[idx] = true;
            }
        }

        // Step 3: Convert stack to string
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
