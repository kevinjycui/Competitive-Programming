t = int(input())
for i in range(t):
    n = [c for c in input()]
    m = ['0']*len(n)
    for c in range(len(n)):
        if n[c] == '4':
            n[c] = '3'
            m[c] = '1'
    print('Case #%d: %s %s' % (i+1, ''.join(n), ''.join(m).lstrip('0')))
