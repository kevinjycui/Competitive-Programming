rhs1 = 7*60
rhe1 = 10*60
rhs2 = 15*60
rhe2 = 19*60
s = input().split(':')
n = int(s[0])*60 + int(s[1])

i = 4*60

while i>0:
    if (n >= rhs1 and n < rhe1) or (n >= rhs2 and n < rhe2):
        i-=1
    else:
        i-=2
    n+=1

h = str((n//60)%24)
m = str(n%60)

if len(h) == 1:
    h = '0'+h
if len(m) == 1:
    m = '0'+m

print(h+':'+m)
