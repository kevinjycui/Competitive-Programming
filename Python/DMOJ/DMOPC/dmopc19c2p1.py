def median(arr):
    if len(arr)%2 == 0:
        return (arr[int(len(arr)/2)] + arr[int(len(arr)/2-1)])/2.0
    else:
        return arr[int(len(arr)/2)]

n = int(input())
s = input().split(' ')
a = []
for i in range(n):
    a.append(int(s[i]))
a.sort()
print(a[0], a[n-1], median(a[:int(n/2)]), median(a), end=' ')
if len(a)%2 != 0:
    print(median(a[int(n/2)+1:]))
else:
    print(median(a[int(n/2):]))
