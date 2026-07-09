class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int[] result = new int[k];

        for (int n : nums) {
            int count = countMap.getOrDefault(n, 0);
            countMap.put(n, count + 1);
        }

        List<Integer>[] freqArray = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (freqArray[count] == null) {
                freqArray[count] = new ArrayList<>();
            }
            freqArray[count].add(num);
        }
        
        int index = 0;

        for (int i = freqArray.length - 1; i >= 0; i--) {
            if (freqArray[i] != null) {
                for (int num : freqArray[i]) {
                    result[index] = num;
                    index++;

                    if (index == k) return result;
                }
            }
        }

        return result;
    }
}