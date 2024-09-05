from typing import List


def maxArea( height: List[int]) -> int:
    if not height:
        return 0
    
    left =0
    right=len(height)-1
    maxWater=0
    while left <right:
        curr =(right-left)* min(height[left],height[right])
        maxWater=max(curr,maxWater)                 
        if height[left]<height[right]:
            left+=1
        else:
            right-=1
    return maxWater