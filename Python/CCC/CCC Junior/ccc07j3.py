n = int(input())
a = [100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000]
for i in range(n):
    a[int(input())-1] = 0
l = len(a)
i = 0
while i<l:
    if a[i] == 0:
        a.pop(i)
        l-=1
    else:
        i+=1
        
if int(input()) > sum(a)/len(a):
    print('deal')
else:
    print('no deal')