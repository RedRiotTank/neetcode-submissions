class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        int boats = 0;

        while (left != right && left < right) {
            int sum = people[left] + people[right];

            if (sum > limit) {
                boats++;
                right--;
            } else {
                people[left] = 0;
                people[right] = 0;
                boats++;
                right--;
                left++;
            }
        }

        if (left == right) {
            boats ++;
        }
        
        return boats;
    }
}