class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;
        if (s.length() == 0) return 0;

        int maxLength = 0;
        HashMap<Character, Integer> letters = new HashMap<>();

        int left = 0;
        letters.put(s.charAt(left), left);

        for (int right = 1; right < s.length(); right++){
            Character letter = s.charAt(right);

            if (letters.containsKey(letter) && letters.get(letter) >= left) {
                left = letters.get(letter) + 1;
            }

            letters.put(letter, right);

            int length = right - left + 1;
            if (length > maxLength) {
                maxLength = length;
            }
        }
        
        return maxLength;
    }
}