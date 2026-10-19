class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sCounter = new HashMap<>();
        HashMap<Character, Integer> tCounter = new HashMap<>();

        if (s.length() != t.length())
            return false;

        for (int x = 0; x <= s.length() - 1; x++) {
            sCounter.put(s.charAt(x), sCounter.getOrDefault(s.charAt(x), 0) + 1);
        }

        for (int i = 0; i <= t.length() - 1; i++) {
            tCounter.put(t.charAt(i), tCounter.getOrDefault(t.charAt(i), 0) + 1);
        }

        return sCounter.equals(tCounter);
    }
}
