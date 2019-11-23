m = int(input())
n = int(input())

count = 0

d = {'0':'0', '1':'1', '8':'8', '6':'9', '9':'6'}

for i in range(m, n+1):
    s = ''
    for c in str(i):
        if c in d:
            s += d[c]
        else:
            break
    if s != '' and int(s[::-1]) == i:
        count += 1

print(count)
