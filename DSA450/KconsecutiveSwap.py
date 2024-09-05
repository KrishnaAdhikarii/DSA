def Kswaps(arr,k):
    if k==0:
        return arr
    k=min(k,len(arr)-1)
    minn=float('inf')
    minindex=0
    for i in range(k+1):
        if arr[i]<minn:
            minn=arr[i]
            minindex=i

    # print("min:",min,minindex)
    while(minindex>0):
        arr[minindex],arr[minindex-1]=arr[minindex-1],arr[minindex]
        minindex-=1
    
    return arr

## Main ##
arr=list(map(int,input().strip().split()))
k=int(input())

print(Kswaps(arr,k))

    