class Solution {
    public int characterReplacement(String s, int k) {
        if (s.length() == 1) return 1;

        HashMap<Character, Integer> lMap = new HashMap<>();
        
        int left = 0;
        int maxAparitions = 1;
        int maxLength = 0;

        lMap.put(s.charAt(left), 1);

        for (int right = 1; right < s.length(); right++){

            Character cRight = s.charAt(right);
            Integer cRightNumber = lMap.getOrDefault(cRight,0) + 1;
            lMap.put(cRight, cRightNumber);

            if (maxAparitions < cRightNumber){
                maxAparitions = cRightNumber;
            }

            if (((right - left + 1) - maxAparitions) > k) {
                Character cLeft = s.charAt(left);
                Integer cLeftNumber = lMap.get(cLeft);
                lMap.put(cLeft, cLeftNumber - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
