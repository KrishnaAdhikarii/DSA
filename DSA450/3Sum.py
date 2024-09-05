from typing import List
def threeSum(nums: List[int]) -> List[List[int]]:
    if not nums:
        return 0
    
    triple=[]
    nums.sort() 
    for i in range (len(nums)-2):
        if i > 0 and nums[i] == nums[i-1]:
            continue
        left,right=i+1,len(nums)-1
        while left<right:
            Sum = nums[i]+nums[left]+nums[right]
            if Sum==0:
                triple.append([ nums[i],nums[left],nums[right]])
                while left < right and nums[left] == nums[left + 1]:
                    left += 1
                while left < right and nums[right] == nums[right - 1]:
                    right -= 1
                left+=1
                right-=1
            elif Sum>0:
                right-=1
            else:
                left+=1
    return triple

result = threeSum([-2,0,0,2,2])
print(result)