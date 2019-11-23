w = int(input())
n = int(input())
t = []
for i in range(n):
    t.append(int(input()))
    if len(t) > 4:
        t.pop(0)
    if sum(t) > w:
        print(i)
        break
    if i == n-1:
        print(i+1)
