def solve(t, s):    
    for i in range(len(s)):
        if s[i:] + s[:i] in t:
            return 'yes'
    return 'no'

t = input()
s = input()
print(solve(t, s))
