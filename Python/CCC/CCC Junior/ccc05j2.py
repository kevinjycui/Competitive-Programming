n = int(input())
m = int(input())
count = 0
for i in range (n, m+1):
    c = 0
    for j in range(1, i+1):
        if i%j==0:
            c+=1
    if c==4:
        count+=1
print('The number of RSA numbers between', n, 'and', m, 'is', count)
