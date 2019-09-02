s = input()
cons = ['', 'b', 'c', 'd', '', 'f', 'g', 'h', 'j', '', 'k', 'l', 'm', 'n'
        '', 'p', 'q', 'r', 's', 't', '', 'v', 'w', 'x', 'y', 'z']
vow = {1:'a', 5:'e', 9:'i', 15:'o', 21:'u'}
ans = ''
for let in s:
    ans += let
    if let in cons:
        c = cons.index(let)
        dif = 26
        nex = ''
        for v in vow:
            if abs(v-c-1)<dif:
                dif = abs(v-c-1)
                nex = vow[v]
        ans += nex
        if cons[c]=='z':
            ans+='z'
        elif cons[c+1]!='':
            ans+=cons[c+1]
        else:
            ans+=cons[c+2]
print(ans)