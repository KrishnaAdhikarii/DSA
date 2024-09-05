def minTime(k,arr):
    if k==0:
        return arr
    arr.sort(reverse=True)
    res=[]
    buff=[]
    while(k>1):
        buff.append(arr[0])