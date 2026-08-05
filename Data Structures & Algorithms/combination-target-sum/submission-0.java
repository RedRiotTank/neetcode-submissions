class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res , target, new ArrayList<>(), 0, 0, nums);
        return res;
    }


    void dfs(List<List<Integer>> res, int target, List<Integer> set, int sum, int start, int[] nums) {
        if (sum  == target) {
            res.add(new ArrayList<>(set));
            return;
        } else if (sum > target) { 
            return;
        }

        for (int i = start; i < nums.length; i++) {
            set.add(nums[i]);
            sum += nums[i];
            dfs(res, target, set, sum, i, nums);
            set.remove(Integer.valueOf(nums[i]));
            sum-= nums[i];
        }
    }
}
