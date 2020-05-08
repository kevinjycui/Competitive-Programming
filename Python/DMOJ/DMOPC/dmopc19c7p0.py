def avg(args):
    return sum(args)/len(args)
a, b, c, d = map(int, input().split(' '))
q = [
    (a, b),
    (a, c),
    (a, d),
    (b, c),
    (b, d),
    (c, d),
    (a, b, c),
    (a, b, d),
    (a, c, d),
    (b, c, d),
    (a, b, c, d)
]
for i in q:
    print(avg(i))
