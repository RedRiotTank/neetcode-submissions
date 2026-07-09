class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String word : strs){
            encoded.append(word.length()).append("#").append(word);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) return new ArrayList<>();

        List<String> decoded = new ArrayList<>();
        int currentIndex = 0;
        
        while (currentIndex < str.length()){
            int code = str.indexOf('#', currentIndex);

            int space = Integer.parseInt(str.substring(currentIndex, code));

            decoded.add(str.substring(code + 1, code + space + 1));
            currentIndex = code + space + 1;
        }

        return decoded;
    }
}