class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        Stack<Character> st=new Stack<>();
        boolean[] thr=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=ch-'a';
            count[index]--;
            if(thr[index]){
                continue;
            }
            while(!st.isEmpty() && ch<st.peek() && count[st.peek()-'a']>0){
                thr[st.pop()-'a']=false;
            }
            st.push(ch);
            thr[index]=true;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();

    }
}