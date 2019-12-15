a = list(map(int, input().split(' ')))
b = list(map(int, input().split(' ')))
for dim in b:
    val = -1
    for side in a:
        if side <= dim:
            val = max(val, side)
    if val == -1:
        print('N')
        break
    else:
        a.remove(val)

if len(a) == 0:
    print('Y')
