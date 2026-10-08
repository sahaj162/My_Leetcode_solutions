class Solution {
    public String removeOuterParentheses(String s) {

        // REMEMBER ONLY THIS LINE---->
        //  if it is 1st openung and last closing then add in result rest is valid paranthesis code ??

        StringBuilder result = new StringBuilder();
        int open  = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

           if(ch == '('){
        
           if(open > 0){
            result.append(ch);
           } 
            open++;
           }else{
            open--;
            if(open > 0){
                result.append(ch);
            }
           }            

        }
        return result.toString();
    }
}