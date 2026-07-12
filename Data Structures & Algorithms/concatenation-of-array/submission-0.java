class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        int n=arr.size();
       int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = arr.get(i);
        }
        
        return ans;
    }
}