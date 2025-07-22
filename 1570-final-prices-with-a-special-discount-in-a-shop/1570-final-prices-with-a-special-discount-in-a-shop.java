class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[] res=prices.clone();
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && prices[stack.peek()]>=prices[i]){
                int index=stack.pop();
                res[index]=prices[index]-prices[i];
            }stack.push(i);
        }return res;
    }
}