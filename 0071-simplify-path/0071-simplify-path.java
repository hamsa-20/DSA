class Solution {
    public String simplifyPath(String path) {
       Stack<String> ans=new Stack<>();
       String[] comp=path.split("/");
       for(String c:comp){
        if(c.equals("") || c.equals(".")){
            continue;
        }else if(c.equals("..")){
            if(!ans.isEmpty()){
                ans.pop();
            }
        }else{
            ans.push(c);
        }
       } 
       StringBuilder sb=new StringBuilder();
       if(ans.isEmpty()){
        return "/";
       }
       for(String s:ans){
        sb.append("/").append(s);
       }
       return sb.toString();
    }
}