import sys
input = sys.stdin.readline
n = int(input())

for i in range(n):
    seq = input().split()
    for s in range(len(seq)):
        seq[s] = int(seq[s])

    ari = True
    geo = True

    for j in range(8):
        if seq[j]+seq[j+2] != 2*seq[j+1]:
            ari = False
        if seq[j]*seq[j+2] != seq[j+1]**2:
            geo = False

    if ari and geo:
        print('both')
    elif ari:
        print('arithmetic')
    elif geo:
        print('geometric')
    else:
        print('neither')

