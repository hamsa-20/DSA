class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res=new StringBuilder();
        int len1=word1.length();
        int len2=word2.length();
        int maxlen=Math.max(len1,len2);
        for(int i=0;i<maxlen;i++){
            if(i<len1){
                res.append(word1.charAt(i));
            }
            if(i<len2){
                res.append(word2.charAt(i));
            }
        }return res.toString();

    }
}