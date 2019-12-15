n = int(input())
for i in range(n):
    m = input()
    if len(m) == 10 and (m[:3] == '416' or m[:3] == '647'):
        print('('+m[:3]+')-'+m[3:6]+'-'+m[6:])
    else:
        print('not a phone number')
