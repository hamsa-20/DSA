class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        int cur=1;
        for(int i=0;i<target.length;i++){
            int t=target[i];
            for(;cur<t;cur++){
                ans.add("Push");
                ans.add("Pop");
            }
            ans.add("Push");
            cur++;
        }
       return ans;
    }
}