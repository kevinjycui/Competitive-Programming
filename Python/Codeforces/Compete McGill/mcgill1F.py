t = int(input())
for i in range(t):
    n = int(input())
    a = list(map(int, input().split(' ')))
    b = list(map(int, input().split(' ')))
    k = -1.1
    for j in range(len(a)):
        if a[j] < b[j] and k == -1.1:
            k = b[j] - a[j]
        elif a[j] == b[j] and k != -1.1:
            k = 0
        if k != -1.1:
            a[j] += k
    print("YES" if a == b else "NO")
