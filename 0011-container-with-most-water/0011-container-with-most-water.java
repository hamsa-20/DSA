class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int start= 0, end = height.length-1;
        while(end>start){
            int heigh =Math.min(height[start], height[end]);
            int val = heigh*(end-start);
            max= Math.max(max,val);
            if(height[start]< height[end]){
                start++;
            }else end--;
        }
   return max; }
}