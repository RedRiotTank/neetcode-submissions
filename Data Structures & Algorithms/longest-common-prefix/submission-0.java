class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        
        boolean coincident = true;
        int index = 0;

        while(coincident){
            if (index >= strs[0].length()){
                break;
            }

            char referenceChar = strs[0].charAt(index);

            for(int i=0; i<strs.length; i++){
                if(index >= strs[i].length() || strs[i].charAt(index) != referenceChar){
                    coincident = false;
                    break;
                }
            }

            if(coincident) {
                result.append(referenceChar);
                index++;
            }

            
        }

        return result.toString();
    }
}