s = input().split(' ')
c = int(s[0])
r = int(s[1])

x = 0
y = 0

while True:
    s = input().split(' ')
    rx = int(s[0])
    ry = int(s[1])
    if rx == 0 and ry == 0:
        break
    x = min(max(x+rx, 0), c)
    y = min(max(y+ry, 0), r)
    print(x, y)
