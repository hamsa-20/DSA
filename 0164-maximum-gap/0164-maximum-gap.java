class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2) return 0;
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<n-1;i++){
            int ans=nums[i+1]-nums[i];
            if(ans>max){
                max=ans;
            }
        }return max;
    }
}