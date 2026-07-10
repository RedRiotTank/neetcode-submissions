class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int maxMul = 0;

        while (left != right) {
            int distance = right - left;
            
            int heightValLeft = heights[left];
            int heightValRight = heights[right];

            int multVal = 0;

            if (heightValLeft < heightValRight){
                multVal = heightValLeft;
                left++;
            } else {
                multVal = heightValRight;
                right--;
            }

            int mul = distance * multVal;

            if (mul > maxMul){
                maxMul = mul;
            }
        }
        
        return maxMul;
    }
}
