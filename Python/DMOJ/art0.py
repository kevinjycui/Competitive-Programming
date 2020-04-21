n = int(input())
vowels = ['a', 'e', 'i', 'o', 'u']
words = ['Hi! ', 'Bye! ', 'How are you? ', 'Follow me! ', 'Help! ']
for i in range(n):
    s = input().lower()
    ans = ''
    for c in s:
        if c in vowels:
            ans += words[vowels.index(c)]
        elif c.isdigit():
            ans += 'Yes! '
    print(ans)