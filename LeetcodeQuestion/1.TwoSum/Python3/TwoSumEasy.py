def two_sum_brute(nums, target):
    result = []
    for i in range(0, len(nums) - 1):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                result.append(i)
                result.append(j)
    return result


def two_sum_two_hash(nums, target):
    h = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in h:
            return [h[complement], i]
        h[num] = i


nums = [3, 3]
target = 6
final = two_sum_two_hash(nums, target)
print(final)