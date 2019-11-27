i = int(input())
sm = 0
c = 0
for l in range(i):
    sm += int(input())
    c += 1
s = int(input())
for l in range(s):
    sm += int(input())
    c += 1
    print("{0:.3f}".format(sm/c))
