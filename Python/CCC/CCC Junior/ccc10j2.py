a = int(input())
b = int(input())
c = int(input())
d = int(input())
s = int(input())

nc = 0
nf = 1
nd = 0
bc = 0
bf = 1
bd = 0

steps = 0

while steps<s:
    steps += 1

    nc += 1
    nd += nf
    if (nf == 1 and nc == a):
        nc = 0
        nf = -nf
    elif (nf == -1 and nc == b):
        nc = 0
        nf = -nf

    bc += 1
    bd += bf
    if (bf == 1 and bc == c):
        bc = 0
        bf = -bf
    elif (bf == -1 and bc == d):
        bc = 0
        bf = -bf

if nd > bd:
    print('Nikky')
elif nd < bd:
    print('Byron')
else:
    print('Tied')
        
