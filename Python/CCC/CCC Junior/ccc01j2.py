x = int(input())
m = int(input())

mult = 0
n = 'No such integer exists.'

while (mult*m+1)/x < m:
    mult+=1
    if (mult*m+1)/x == (mult*m+1)//x:
        n = (mult*m+1)//x

print(n)