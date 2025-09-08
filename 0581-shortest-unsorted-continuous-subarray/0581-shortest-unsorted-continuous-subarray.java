class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(start<end && nums[start]<=nums[start+1]){
            start++;
        }
        if(start==end) return 0;
        while(end>start && nums[end]>=nums[end-1]){
            end--;
        }
        for(int i=start;i<=end;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        while(start>0 && min<nums[start-1]){
            start--;
        }
        while(end<nums.length-1 && max>nums[end+1]){
            end++;
        }
        return end-start+1;
        
    }
}