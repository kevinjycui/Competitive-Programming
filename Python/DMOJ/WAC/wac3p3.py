s = input()
m = int(input())
combos = []
points = []
for i in range(m):
    t = input().split(' ')
    combos.append(t[0])
    points.append(int(t[1]))

total = len(s)

while len(s) > 0:
    cm = -1
    for com in range(len(combos)):
        if combos[com] == s[:len(combos[com])] and (cm == -1 or len(combos[com]) > len(combos[cm])):
            cm = com                
            
    if cm == -1:
        s = s[1:]
    else:
        total += points[cm]
        s = s[len(combos[cm]):]

print(total)