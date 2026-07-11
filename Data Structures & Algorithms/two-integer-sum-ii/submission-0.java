class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int[] sol = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum > target) {
                right--;
            } else if (target > sum) {
                left++;
            } else {
                sol[0] = left + 1;
                sol[1] = right + 1;

                return sol;
            }
        }

        return null;
    }
}
