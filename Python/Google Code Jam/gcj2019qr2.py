t = int(input())
for i in range(t):
    n = int(input())
    s = input()
    print('Case #%d: %s' % (i+1, s.replace('E', 'T').replace('S', 'E').replace('T', 'S')))
