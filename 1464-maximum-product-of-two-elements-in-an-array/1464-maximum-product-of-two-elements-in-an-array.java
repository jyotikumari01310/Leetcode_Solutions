class Solution {
    public int maxProduct(int[] nums) {

        Arrays.sort(nums);
        int n=nums.length;

        int option1=(nums[0]-1) * (nums[n-1]-1);
        int option2=(nums[n-1]-1) * (nums[n-2]-1);

        return Math.max(option1,option2);
        
    }
}