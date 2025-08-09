class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int start=0,end=nums.length-1;
        while(end>start){
            if(nums[end]+nums[start]==k){
                count++;
                end--;
                start++;
                continue;

            }
            if (nums[end]+nums[start]>k){
                end--;
            }
            else{
                start++;
            }

        }
    return count;}
}