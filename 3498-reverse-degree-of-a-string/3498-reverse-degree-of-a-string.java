class Solution {
    public int reverseDegree(String s) {

        int sum = 0;

        for(int i=0; i<s.length(); i++){
            int indxRevAlphabet = 26 - (s.charAt(i) - 'a');
            sum += indxRevAlphabet * (i + 1);   // i = indx of string
        }
        
        return sum;
    }
}