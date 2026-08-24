class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count==0) ele=nums[i];
            if(nums[i]==ele) count++;
            else count--;
        }
        return ele;
    }
}