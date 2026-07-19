class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int calculation = 0;
        int bestIndex = 0;

        for (int i = 0; i < k; i++){
            calculation += Math.abs(arr[i] - x);
        }

        int minCalculation = calculation;
        
        for (int i = 1; i <= arr.length - k; i++){
            calculation -= Math.abs(arr[i - 1] - x);
            calculation += Math.abs(arr[i + k - 1] - x);

            if (calculation < minCalculation) {
                minCalculation = calculation;
                bestIndex = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = bestIndex; i < bestIndex + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}