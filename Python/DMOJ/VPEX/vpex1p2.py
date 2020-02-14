n = int(input())
x = list(map(int, input().split(' ')))
print(len(x) - x.count(sum(x)//len(x)))
