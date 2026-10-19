class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length() != t.length()) return false;

        HashMap<Character, Integer> count = new HashMap<>();

        // here I counted the number of times the characters appear.
        for (int i = 0; i < s.length(); i++){
            char iChar = s.charAt(i);
            count.put(iChar, count.getOrDefault(iChar,0) + 1);
        }

        for (int i = 0; i < t.length(); i++){
            char iChar = t.charAt(i);
            // aba       aab
            // a:2 b:1
            Integer n = count.getOrDefault(iChar, 0);
            if (n == 0) return false; // this means that this value did not exist previously
            count.put(iChar, n - 1);
        }

        return true;
    }
}
