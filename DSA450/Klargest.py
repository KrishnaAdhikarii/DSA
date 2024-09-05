from typing import List

def findKthLargest(nums: List[int], k: int) -> int:
    if not nums:
        return None 
    if k > len(nums):
        return None  

    for i in range(k):
        maxi = max(nums)
        nums.remove(maxi)

    return maxi

nums = [3, 1, 4, 1, 5, 9, 2, 6, 5]
k = 4
result = findKthLargest(nums, k)
print(f"The {k}th largest element is: {result}")
