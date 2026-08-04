class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, nums, new ArrayList<>(), res);
        return res;
    }

    void dfs(int start, int[] nums, List<Integer> subSet, List<List<Integer>> res) {
        res.add(new ArrayList<>(subSet));

        for (int i = start; i < nums.length; i++) {
            subSet.add(nums[i]);
            dfs(i + 1, nums, subSet, res);
            subSet.remove(subSet.size() - 1);
        }
    }
}
