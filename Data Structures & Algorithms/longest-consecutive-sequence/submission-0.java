class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        if (nums.length == 1) return 1;

        int maxConsecutive = 1;

        Set<Integer> numSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            
            if (!numSet.contains(nums[i] - 1)) {

                boolean consecutive = true;
                int consecution = 1;

                while(consecutive) {
                    if (!numSet.contains(nums[i] + consecution)) {
                        consecutive = false;
                    } else {
                        consecution++;
                    }
                }

                if (consecution > maxConsecutive) {
                    maxConsecutive = consecution;
                }
                
            }
        }
        
        return maxConsecutive;
    }
}
