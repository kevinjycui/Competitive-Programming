w, h = list(map(int, input().split(' ')))
s = ''
for r in range(h):
    s += input()+'\n'
berries = s.count('o')
print(s.replace('o', ' ').replace('*', ' '), end='')
print('o'*berries)
