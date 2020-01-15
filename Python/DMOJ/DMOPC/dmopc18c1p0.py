a = []
for i in range(3):
    a.append(int(input()))
if a == sorted(a):
    print('Good job!')
else:
    print('Try again!')
