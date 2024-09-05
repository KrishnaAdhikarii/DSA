def findMinOps(arr, n):
    ans =0
    i=0
    j=len(arr)-1
    while i<=j:
        if arr[i]==arr[j]:
            i+=1
            j-=1
        elif arr[i]>arr[j]:
            j-=1
            arr[j]+=arr[j+1]
            ans+=1
        else:
            i+=1
            arr[i]+=arr[i-1]
            ans+=1
        
    return ans 

arr = [1, 4, 5,8, 9,8, 1]
n = len(arr)
print("Count of minimum operations is " + str(findMinOps(arr, n)))
        
