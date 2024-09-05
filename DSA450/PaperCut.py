def paperCut(ln,wt):
    if ln==0 or wt==0:
        return -7
    area=ln*wt
    sum=0
    
    while(ln>0 and wt>0):
        if ln<wt:
            ln,wt=wt,ln
            area=ln*wt
        
        # print(ln,wt)

        curr=area//(wt*wt)
        # print("curr:",curr)
        sum+=curr
        # print("sum:",sum)
        ln=ln-curr*wt

    return sum

### Main ###

Len=int(input())
Wid=int(input())
print("Answer:",paperCut(Len,Wid))
