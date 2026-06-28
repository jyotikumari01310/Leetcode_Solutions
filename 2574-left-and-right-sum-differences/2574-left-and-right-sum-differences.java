class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum=0;

        for(int ele: nums){
            totalSum=totalSum+ele;
        }

        int leftSum=0;

        int [] ans= new int[nums.length];

        for(int i=0; i<nums.length; i++){

            int rightSum=totalSum-leftSum-nums[i];
            ans[i]=Math.abs(leftSum-rightSum);
            leftSum=leftSum+nums[i];
        }

        return ans;

    }
}