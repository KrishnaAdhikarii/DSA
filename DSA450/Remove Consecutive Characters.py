def RemoveChar(str):
    stack=[]
    for i in str:
        if stack and stack[-1]==i:
            continue
        else:
            stack.append(i)
    return ''.join(stack)

s="aabab"
print(RemoveChar(s))
    