//Maximum Subarray
//My Brute Force
class Solution
{
    public int maxSubArray(int[] nums)
    {
        if(nums.length == 1)  return nums[0];  // Base case
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            currSum += nums[i];
            currSum = Math.max(currSum, nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}

//Time Complexity : O(n)
