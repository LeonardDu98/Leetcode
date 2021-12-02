class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        MAX_ALLOWED = 2
        result = 1
        times = 1
        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:
                nums[result] = nums[i]
                result += 1
                times = 1
            elif times < MAX_ALLOWED:
                nums[result] = nums[i]
                result += 1
                times += 1
        return result