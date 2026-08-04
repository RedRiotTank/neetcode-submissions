class Solution {
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> numsArrayList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            numsArrayList.add(nums[i]);
        }
        
        dfs(numsArrayList);

        return new ArrayList<>(set);
    }

    void dfs(List<Integer> nums) {
        List<Integer> subset = new ArrayList<>(nums);
        set.add(subset);

        for (int i = 0; i < nums.size(); i++) {
            Integer element = nums.remove(i);
            dfs(nums);                         
            nums.add(i, element);
        }
        
    }
}
