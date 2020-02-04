s = list(map(int, input().split(' ')))
v = 0
if s[0] < -40:
    v += 1
if s[1] >= 15:
    v += 1
if s[2] > 50:
    v += 1
if v >= 2:
    print('YES')
else:
    print('NO')