a, b, c, d = map(int, input().split(' '))
if b == 0 and a<c-1:
    print('invalid')
elif b!=0 and a<c:
    print('invalid')
elif 4*(a + b + c + 1) - (2*a + 4*b + 6*c) != d:
    print('invalid')
else:
    print('C%dH%d' % (a + b + c + 1, d))
