consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p',
              'q', 'r', 's', 't', 'v', 'w', 'x', 'z']
while True:
    s = input().lower()
    if s=='quit!':
        break
    can = False
    while not can:
        if 'or' in s:
            if s.index('or')>0 and s.index('or')==len(s)-2 and len(s)>4 and s[s.index('or')-1] in consonants:
                s = s.replace('or', 'our', 1)
            else:
                s = s.replace('or', '$$$', 1)
        else:
            s = s.replace('$$$', 'or')
            can = True
    print(s)