n = int(input())
dancers = []
for i in range(n):
    dancers.append(int(input()))
if dancers[0] == sorted(dancers)[::-1][0] and dancers.count(dancers[0]) == 1:
    print('YES')
else:
    print('NO')