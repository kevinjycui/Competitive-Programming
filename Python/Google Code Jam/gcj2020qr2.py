t = int(input())
for i in range(t):
    s = input()
    sp = ''
    depth = 0
    for c in s:
        if int(c) > depth:
            sp += '('*(int(c)-depth)
        elif int(c) < depth:
            sp += ')'*(depth-int(c))
        depth = int(c)
        sp += c
    sp += ')'*depth
    print('Case #%d: %s' % (i+1, sp))
