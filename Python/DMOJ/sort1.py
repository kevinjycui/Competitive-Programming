n = int(input())
a = list(map(int, input().split(' ')))
print(*a)
i = 0
while a != sorted(a):
    if a[i] > a[i+1]:
        t = a[i]
        a[i] = a[i+1]
        a[i+1] = t
        print(*a)
    i = (i+1)%(n-1)
