n = int(input())
m = int(input())
count = 2
while n-m>=0:
    t = m
    m = n-m
    n = t
    count+=1
print(count)