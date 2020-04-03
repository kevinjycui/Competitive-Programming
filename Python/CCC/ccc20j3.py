n = int(input())
minx = 101
maxx = 0
miny = 101
maxy = 0
for i in range(n):
    x, y = map(int, input().split(','))
    minx = min(minx, x-1)
    maxx = max(maxx, x+1)
    miny = min(miny, y-1)
    maxy = max(maxy, y+1)
print('%d,%d' % (minx, miny))
print('%d,%d' % (maxx, maxy))
