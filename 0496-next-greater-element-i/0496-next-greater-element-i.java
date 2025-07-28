class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> ngeMap = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i = nums2.length - 1; i >= 0; i--){
            int curr = nums2[i];
            while(!st.isEmpty() && st.peek() <= curr){
                st.pop();
            }
            if(!st.isEmpty()){
                ngeMap.put(curr, st.peek());
            }
            else{
                ngeMap.put(curr, -1);
            }
            st.push(curr);
        }
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            res[i] = ngeMap.get(nums1[i]);
        }
        return res;
    }
}