n, k, l = list(map(int, input().split(' ')))
c = []
for i in range(n):
    c.append(int(input()))
count = 0
for i in range(n):
    if (c[i] >= k) != (max(abs(c[i]-c[(i-1)%n]), abs(c[i]-c[(i+1)%n])) <= l):
        count += 1
print(count)
