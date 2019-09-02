n = int(input())
keypad = [[], ['A', 'B', 'C'], ['D', 'E', 'F'],
          ['G', 'H', 'I'], ['J', 'K', 'L'], ['M', 'N', 'O'],
          ['P', 'Q', 'R', 'S'], ['T', 'U', 'V'], ['W', 'X', 'Y', 'Z']]
for t in range(n):
    phon = input()
    ans = ''
    for p in phon:
        if p.isdigit():
            ans += p
        elif p.isalpha():
            for k in range(len(keypad)):
                if p in keypad[k]:
                    ans += str(k+1)
    print(ans[0:3]+'-'+ans[3:6]+'-'+ans[6:10])