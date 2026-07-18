class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] alphabet  = new int[27];
        int[] needArray  = new int[27];

        for (int i = 0; i < s1.length(); i++) {
            alphabet['z' - s2.charAt(i)] += 1;
            needArray['z' - s1.charAt(i)] += 1;
        }

        if (Arrays.equals(alphabet , needArray)) {
                return true;
        }

        for (int left = 1; left <= s2.length() - s1.length(); left++) {
            int right = left + s1.length() - 1; 

            alphabet['z' - s2.charAt(left - 1)] -= 1;
            alphabet['z' - s2.charAt(right)] += 1;

            if (Arrays.equals(alphabet , needArray)) {
                return true;
            }

        }

        return false;
    }
}
