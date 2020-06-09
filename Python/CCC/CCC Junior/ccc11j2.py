def getAltitude(h, t):
    return -6*t**4 + h*t**3 + 2*t**2 + t

h = int(input())
m = int(input())
t = 1

while getAltitude(h, t) > 0 and m > t:
    t += 1

if getAltitude(h, t) <= 0:
    print('The balloon first touches ground at hour:\n'+str(t))
else:
    print('The balloon does not touch ground in the given time.')
