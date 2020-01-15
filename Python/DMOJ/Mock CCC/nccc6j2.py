s = input()
count = 0
for i in range(len(s)):
    if s[i] != 'pusheen'[i]:
        count += 1
print(count)
