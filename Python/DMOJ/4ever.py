ones = ["", "one","two","three","four", "five", "six","seven","eight","nine","ten","eleven","twelve", "thirteen", "fourteen", "fifteen","sixteen","seventeen", "eighteen","nineteen"]
twenties = ["","","twenty","thirty","forty", "fifty","sixty","seventy","eighty","ninety"]
thousands = ["","thousand","million", "billion"]

def num999(n):
    c = n % 10
    b = ((n % 100) - c) // 10
    a = ((n % 1000) - (b * 10) - c) // 100
    t = ""
    h = ""
    if a != 0:
        t = ones[a] + "hundred"
    if b <= 1:
        h = ones[n%100]
    elif b > 1:
        h = twenties[b] + ones[c]
    st = t + h
    return st

def num2word(num):
    if num == 0: return 'zero'
    i = 3
    n = str(num)
    word = ""
    k = 0
    while(i == 3):
        nw = n[-i:]
        n = n[:-i]
        if int(nw) == 0:
            word = num999(int(nw)) + thousands[int(nw)] + word
        else:
            word = num999(int(nw)) + thousands[k] + word
        if n == '':
            i = i+1
        k += 1
    return word

n = int(input())

chain = [n]

while (n != 4):
    n = len(num2word(n))
    print(n)