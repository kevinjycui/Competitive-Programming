n = int(input())
q = list(map(int, input().split(' ')))
p = [0]
i = 0
for j in q:
    i += j
    p.append(i)
diff = 1-min(p)
for j in range(len(p)):
    p[j] += diff
if sorted(p) != list(range(1, n+1)):
    print(-1)
else:
    print(' '.join(map(str, p)))
