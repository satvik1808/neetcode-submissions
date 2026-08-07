
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count the frequency of each element
        Map<Integer, Integer> data = new HashMap<>();
        for (int num : nums) {
            data.put(num, data.getOrDefault(num, 0) + 1);
        }

        // 2. Create an array of lists where the index represents the frequency
        // Size is nums.length + 1 because max frequency is the length of the array
        @SuppressWarnings("unchecked")
        List<Integer>[] freq = new List[nums.length + 1];

        // 3. Put the keys (numbers) into the list at their frequency index
        for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
            int key = entry.getKey();
            int frequency = entry.getValue();
            
            // Initialize the list at this index if it doesn't exist yet
            if (freq[frequency] == null) {
                freq[frequency] = new ArrayList<>();
            }
            freq[frequency].add(key);
        }

        // 4. Gather the top k elements by iterating from the end (highest frequency)
        int[] result = new int[k];
        int counter = 0;
        
        for (int i = freq.length - 1; i >= 0; i--) {
            if (freq[i] != null) {
                for (int num : freq[i]) {
                    result[counter] = num;
                    counter++;
                    // Once we have collected k elements, return the result
                    if (counter == k) {
                        return result;
                    }
                }
            }
        }
        
        return result;
    }
}