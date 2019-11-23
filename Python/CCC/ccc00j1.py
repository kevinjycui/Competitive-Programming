s = input().split(' ')
n = int(s[0])
m = int(s[1])

print('Sun Mon Tue Wed Thr Fri Sat')

for i in range(0, n-1):
    print('    ', end='')

for i in range(n, m+n):
    if len(str(i-n+1)) == 1:
        print('  ', end='')
    else:
        print(' ', end='')
    print(i-n+1, end='')
    if i%7 == 0 or i == m+n-1:
        print()
    else:
        print(' ', end='')
