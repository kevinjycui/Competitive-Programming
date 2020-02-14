	
s = map(int, input().split(' '))
t = map(int, input().split(' '))
print(max(sum(sorted(s)[1:]), sum(sorted(t)[1:])))