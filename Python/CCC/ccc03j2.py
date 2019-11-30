import sys
from math import sqrt
input = sys.stdin.readline
while True:
    n = int(input())
    if n == 0:
        break
    x, y = int(sqrt(n)), int(sqrt(n))
    while x*y != n:
        y += 1
        x = n//y
    print('Minimum perimeter is '+str(2*x+2*y)+' with dimensions '+str(x)+' x '+str(y))
