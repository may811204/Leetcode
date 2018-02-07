class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        # O(logn), O(1)
        if not numbers: return numbers
        
        l, r = 0, len(numbers)-1
        
        while l < r:
            if numbers[l] + numbers[r] == target: return [l+1, r+1]
            elif numbers[l] + numbers[r] < target: l += 1
            else: r -= 1
        return [-1, -1]