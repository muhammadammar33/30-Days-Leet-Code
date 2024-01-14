class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as a reference
        String reference = strs[0];

        for (int i = 0; i < reference.length(); i++) {
            char currentChar = reference.charAt(i);

            // Check if the current character is common for all strings
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return reference.substring(0, i);
                }
            }
        }

        return reference;
    }
}