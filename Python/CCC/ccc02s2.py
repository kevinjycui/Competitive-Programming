import math
n = int(input())
d = int(input())
ans = ''
if n//d>0:
    ans+=str(n//d)+" "
if n%d!=0:
    gcf = 1
    for i in range(1, d):
        if (n%d)%i==0 and d%i==0 and i>gcf:
            gcf = i
    ans+=str((n%d)//gcf)+"/"+str(d//gcf)
if ans=='':
    print(0)
else:
    print(ans)