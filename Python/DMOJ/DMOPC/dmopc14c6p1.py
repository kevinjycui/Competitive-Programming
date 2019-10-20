n = int(input())
a = []
for i in range(n):
    a.append(input())
if a[a.index('Bessarion')-1] in ['Leslie', 'Bayview'] and a[a.index('Bessarion')+1] in ['Leslie', 'Bayview']:
    print('Y')
else:
    print('N')
