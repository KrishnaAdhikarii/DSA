
from typing import List


def maxProduct(nums: List[int]) -> int:
    maxi=currmax=currmin=nums[0]
    for num in nums[1:]:
        if num<0:
            currmin,currmax=currmax,currmin

        currmax=max(currmax*num,num,currmin*num)
        currmin=min(num,currmin*num)
        
        maxi=max(maxi,currmax)
    return maxi

result = maxProduct([1,0,-1,2,3,-5,-2])
print(result)