def is_valid_parenthesis(s):
    stack=[]

    for i in s:
        if i=='[' or '(' or '{': stack.append(i)
        elif i==']' or ')' or '}':
