class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] stringArray = str.toCharArray();
            java.util.Arrays.sort(stringArray);
            String stringKey = new String(stringArray);

            if (map.containsKey(stringKey)) {
                List<String> anagramsObtained = map.get(stringKey);
                anagramsObtained.add(str);
                map.put(stringKey, anagramsObtained);
            } else {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(str);
                map.put(stringKey, anagrams);
            }

        }
        List<List<String>> finalList = new ArrayList<>(); //        "aab":["aba","baa","aab"]
        map.forEach((key, stringList)->{
            finalList.add(stringList);
        });
        return finalList;
    }
}
