def palin(s):
    for i in range(len(s), 1, -1):
        for j in range(0, len(s)-i+1):
            if s[j:j+i] == s[j:j+i][::-1]:
                return i

s = input()
print(palin(s))