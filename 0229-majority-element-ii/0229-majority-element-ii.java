class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int count =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                if(count>n/3){
                    li.add(nums[i-1]);
                }count=1;
            }
        }
        if(count>n/3){
            li.add(nums[n-1]);
        }return li;
    }
}