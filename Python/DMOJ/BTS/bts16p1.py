s = input()
uc = 0
lc = 0
for c in s:
    if c.isalpha() and c.upper() == c:
        uc += 1
    elif c.isalpha():
        lc += 1
if uc > lc:
    print(s.upper())
elif lc > uc:
    print(s.lower())
else:
    print(s)