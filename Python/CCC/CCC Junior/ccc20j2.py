p = int(input())
n = int(input())
r = int(input())
d = 0
total = n
while total <= p:
    d += 1
    total += n*(r**d)
print(d)
