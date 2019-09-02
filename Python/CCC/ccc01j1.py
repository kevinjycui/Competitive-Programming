n = int(input())
for i in range(1, n+1, 2):
    print('*'*i, end="")
    print(' '*(2*(n-i)), end="")
    print('*'*i, end="")
    print()
for i in range(n-2, 0, -2):
    print('*'*i, end="")
    print(' '*(2*(n-i)), end="")
    print('*'*i, end="")
    print()