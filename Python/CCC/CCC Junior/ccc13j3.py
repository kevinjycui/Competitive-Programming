n = int(input())+1
flag = True
while flag:
    flag = False
    for i in str(n):
        if str(n).count(i)>1:
            flag = True
    n+=1
print(n-1)
