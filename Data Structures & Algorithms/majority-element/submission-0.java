class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();

        int middleP = nums.length / 2;

        for (int i=0; i<nums.length; i++){
             counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);

             if(counter.get(nums[i]) > middleP) 
                return nums[i];
        }

        return 0;
    }
}