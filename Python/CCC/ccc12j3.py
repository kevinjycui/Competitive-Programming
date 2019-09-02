s = ['*x*',
     ' xx',
     '* *']
n = int(input())
for i in s:
    for num in range(n):
        for j in i:
            print(j*n, end="")
        print()