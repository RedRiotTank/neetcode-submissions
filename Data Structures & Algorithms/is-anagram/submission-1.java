class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i=0; i < s.length(); i++){
            var character = s.charAt(i);

            sMap.put(character, sMap.getOrDefault(character,0) + 1);
        }

        for(int i=0; i < t.length(); i++){
            var character = t.charAt(i);

            tMap.put(character, tMap.getOrDefault(character,0) + 1);
        }

        return sMap.equals(tMap);
    }
}
