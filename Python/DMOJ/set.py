import sys
input = sys.stdin.readline
n = int(input())
a = set({})
for i in range(n):
    v = int(input())
    if v not in a:
        a.add(v)
print(len(a))
