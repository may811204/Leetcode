class Solution:
    def maximumProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        print(nums.sort())
        return max(nums[-1]*nums[-2]*nums[-3], nums[0]*nums[1]*nums[-1])