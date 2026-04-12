class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> charCounts = new HashMap<>();
        
        // Count frequencies of characters in string 's'
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        
        // Decrease frequencies using string 't'
        for (char c : t.toCharArray()) {
            // If 't' has a character not in 's', or too many of a character
            if (!charCounts.containsKey(c) || charCounts.get(c) == 0) {
                return false;
            }
            charCounts.put(c, charCounts.get(c) - 1);
        }
        
        return true;
    }
}
