n = int(input())
p = list(map(int, input().split(' ')))

count = 0

for i in range(0, n-1):
    for j in range(0, n-i-1):
        if p[j] < p[j+1]:
            t = p[j]
            p[j] = p[j+1]
            p[j+1] = t
            count += 1

print(count)

