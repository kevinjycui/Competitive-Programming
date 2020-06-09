n = int (input())
sCount = 0
tCount = 0
for i in range (n):
    s = str (input())
    for j in range(len(s)):
        if (s[j].lower()=='s'):
            sCount += 1
        elif (s[j].lower()=='t'):
            tCount += 1
if (sCount>=tCount):
    print("French")
else:
    print("English")