def cut(Hcuts,Vcuts):
    Hpieces=1
    Vpieces=1

    Hcuts.sort(reverse=True)
    Vcuts.sort(reverse=True)
    TotalCost=0
    i=j=0
    while i<len(Hcuts) and j<len(Vcuts):
        if Hcuts[i]>=Vcuts[j]:
            TotalCost+=Hcuts[i]*Vpieces
            Hpieces+=1
            i+=1
        
        else:
            TotalCost+=Vcuts[j]*Hpieces
            Vpieces+=1
            j+=1
    
    while i < len(Hcuts):
        TotalCost += Hcuts[i] * Vpieces
        i += 1

    while j < len(Vcuts):
        TotalCost += Vcuts[j] * Hpieces
        j += 1

    print(Hpieces,Vpieces)
    return TotalCost

m=int(input())
n=int(input())

H_arr=[int(input()) for _ in range(m-1)]
V_arr=[int(input()) for _ in range(n-1)]

print("Answer:",cut(H_arr,V_arr))

