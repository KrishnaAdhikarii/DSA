from typing import List

def productExceptSelf(nums: List[int]) -> List[int]:
    n = len(nums)
    prefixProducts = [1] * n
    ans = [1] * n

    for i in range(1, n):
        prefixProducts[i] = prefixProducts[i - 1] * nums[i - 1]

    suffixProduct = 1
    for i in range(n - 1, -1, -1):
        ans[i] = prefixProducts[i] * suffixProduct
        suffixProduct *= nums[i]

    return ans


result = productExceptSelf([1, 2, 3, 4])
print(result)
