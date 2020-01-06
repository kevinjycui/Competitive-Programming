s = input()
t = input()
k = int(input())

for c in range(len(s)):
    if (s[c] == ' ') != (t[c] == ' '):
        k = 0
        break
    elif s[c] != t[c]:
        k -= 1

if k <= 0:
    print('No plagiarism')
else:
    print('Plagiarized')
