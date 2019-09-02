n = int(input())
for j in range(n):
    i = int(input())
    b = str(bin(i))[2:]
    if len(b)%4!=0:
        b = '0'*(4-len(b)%4)+b
    l = []
    for i in range(0, len(b), 4):
        l.append(b[i:4+i])
    if len(l[len(l)-1])<4:
        l[len(l)-1] = '0'*(4-len(l[len(l)-1] ))+l[len(l)-1] 
    b = ' '.join(l)
    print(b)