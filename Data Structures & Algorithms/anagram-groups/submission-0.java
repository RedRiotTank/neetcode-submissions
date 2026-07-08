class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        HashMap<String,List<String>> anaMap = new HashMap<>();

        for (String word : strs){

            int[] keyArray = new int[26];

            for (int l=0; l<word.length(); l++){
                int lPosition = word.charAt(l) - 'a';
                keyArray[lPosition] = keyArray[lPosition] + 1;
            }

            String key = Arrays.toString(keyArray);

            List<String> wordList = new ArrayList<>();
            
            if(!anaMap.containsKey(key)){
                anaMap.put(key, new ArrayList<>());
            }

            List<String> workList = anaMap.get(key);
            workList.add(word);

            anaMap.put(key, workList);
        }



        return new ArrayList<>(anaMap.values());
        
    }
}
