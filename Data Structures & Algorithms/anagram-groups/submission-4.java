
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // The key is a String representation of the character counts
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String currentWord : strs) {
            // 1. Create an array to count the frequency of each of the 26 letters
            int[] charCounts = new int[26];
            for (char c : currentWord.toCharArray()) {
                charCounts[c - 'a']++;
            }
            
            // 2. Convert the array into a string to use as a unique key
            // Arrays.toString() turns it into a format like "[1, 0, 2, 0, ...]"
            String key = Arrays.toString(charCounts);
            
            // 3. Group the word into the map
            anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(currentWord);
        }

        return new ArrayList<>(anagramMap.values());
    }
}