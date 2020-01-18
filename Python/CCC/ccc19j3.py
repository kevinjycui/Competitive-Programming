n = int(input())
for i in range(n):
    s = input()
    count = 1
    for c in range(len(s)):
        if c == len(s)-1 or s[c] != s[c+1]:
            print(count, s[c], end=' ')
            count = 1
        else:
            count += 1
    print()
