def CombinatioonbalSumIV(nums,Target):
    dp=[0]*(Target+1)
    dp[0]=1
    
    for i in range(Target+1):
        for num in nums:
            if i-num>=0:
                dp[i]+=dp[i-num]

    return dp[Target]

# ?main
nums=[9]
Target=7
print(CombinatioonbalSumIV(nums,Target))
