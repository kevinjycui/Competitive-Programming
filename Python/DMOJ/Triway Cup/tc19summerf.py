import math

n = input()
m = input()
a = int(n.split(" ")[0])
b = int(n.split(" ")[1])
c = int(n.split(" ")[2])
x = int(m.split(" ")[0])
y = int(m.split(" ")[1])
z = int(m.split(" ")[2])

def chebyshev(a, b, c, x, y, z):
    return max(abs(a-x), abs(b-y), abs(c-z))

def euclid(a, b, c, x, y, z):
    return int(math.sqrt((a-x)**2+(b-y)**2+(c-z)**2))

def manhattan(a, b, c, x, y, z):
    return abs(x-a)+abs(y-b)+abs(z-c)

print(chebyshev(a, b, c, x, y, z))

print(euclid(a, b, c, x, y, z))

print(manhattan(a, b, c, x, y, z))