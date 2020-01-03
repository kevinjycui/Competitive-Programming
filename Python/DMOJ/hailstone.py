n = int(input())
op = 0
while n != 1:
    if n%2 == 0:
        n //= 2
    else:
        n *= 3
        n += 1
    op += 1
print(op)
