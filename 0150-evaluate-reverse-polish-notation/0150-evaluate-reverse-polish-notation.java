class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ans=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String token=tokens[i];
            if(token.equals("+") || token.equals("-") || token.equals("*") ||token.equals("/")){
                int num2=ans.pop();
                int num1=ans.pop();
                int res;
                if(token.equals("+")){
                    res=num1+num2;
                }else if(token.equals("-")){
                    res=num1-num2;
                }else if(token.equals("*")){
                    res=num1*num2;
                }else{
                    res=num1/num2;
                }
                ans.push(res);
            }else{
                ans.push(Integer.parseInt(token));
            }
        }
        return ans.pop();
    }
}