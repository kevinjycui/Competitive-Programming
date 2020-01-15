s = input()
val = 0
roman = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
for c in range(0, len(s), 2):
    i = int(s[c]) * roman[s[c+1]]
    if c < len(s)-2 and roman[s[c+3]] > roman[s[c+1]]:
        i *= -1
    val += i
print(val)
